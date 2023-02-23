package stepdefinitions.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.RegistrationPojo;
import pojos.RegistrationPostPojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;


public class US_001_TC_001_Api {

    Response response;
    RegistrationPostPojo expectedData;

    RegistrationPojo actualData;

    @Given("user sends post request to the {string}")
    public void user_sends_post_request_to_the(String endPoint) throws JsonProcessingException {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("");
        expectedData= new RegistrationPostPojo(true,arrayList,"anonymousUser","2023-02-18T12:10:08.635Z","derenfer@hotmail.com",
                "derenferda",1132,"string","string","adminteam05","2023-02-23T05:38:27.635Z","deren","adminteam05","9187345","367-45-2215");

        response = given().when().contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateTokenForAdmin()).post(endPoint);
        response.prettyPrint();

        actualData= new ObjectMapper().readValue(response.asString(),RegistrationPojo.class);

        System.out.println(expectedData);
    }
    @Then("Http status code is {int}")
    public void http_status_code_is(Integer statusCode) {
        assertEquals((int) statusCode, response.getStatusCode());
    }

    @Then("verify all data")
    public void verifyAllData() {


        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getSsn(),actualData.getSsn());
        assertEquals(expectedData.getEmail(),actualData.getEmail());




    }
}