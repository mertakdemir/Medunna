package stepdefinitions.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.RegistrationPojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;


public class US_002_TC_001_Api {

    Response response;
    RegistrationPojo expectedData;

    RegistrationPojo actualData;

    @Given("user sends GET request to the {string}")
    public void user_sends_get_request_to_the(String endPoint) throws JsonProcessingException {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ROLE_ADMIN");
        expectedData= new RegistrationPojo(1132,"adminteam05","string","akdemir","123-22-3333","abcddd@gmail.com",
                "string",true,"string","anonymousUser","2023-02-18T12:10:08.075588Z",
                "adminteam05","2023-02-21T16:14:31.479470Z",arrayList);

        response = given().when().headers("Authorization","Bearer "+generateTokenForAdmin()).get(endPoint);
        response.prettyPrint();

        actualData= new ObjectMapper().readValue(response.asString(),RegistrationPojo.class);

        System.out.println(expectedData);
    }
    @Then("Http Status code is {int}")
    public void http_status_code_is(Integer statusCode) {
        assertEquals((int) statusCode, response.getStatusCode());
    }

    @Then("verify email api")
    public void verifyEmailApi() {
        String email=expectedData.getEmail().toString();
        assertEquals(email,actualData.getEmail());
    }
}
