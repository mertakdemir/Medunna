package stepdefinitions.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.RegistrationPostPojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;


public class US_001_TC_001_Api {

    Response response;
    RegistrationPostPojo expectedData;

    RegistrationPostPojo actualData;

    @Given("user sends post request to the {string}")
    public void user_sends_post_request_to_the(String endPoint) throws JsonProcessingException {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("ghu");
        expectedData= new RegistrationPostPojo(true,arrayList,"string","2023-02-22T22:03:30.635Z","deremere@hotmail.com",
                "dere",0,"string","string","string","2023-02-22T22:03:30.635Z","mere","cenk","987345","345-89-2346");

        response = given().when().contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateTokenForAdmin()).post(endPoint);
        response.prettyPrint();

        actualData= new ObjectMapper().readValue(response.asString(),RegistrationPostPojo.class);

        System.out.println(expectedData);
    }
    @Then("Http status code is {int}")
    public void http_status_code_is(Integer statusCode) {
        assertEquals((int) statusCode, response.getStatusCode());
    }

    @Then("verify all data")
    public void verifyAllData() {

        assertEquals(expectedData.getLogin(),actualData.getLogin());
        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getSsn(),actualData.getSsn());
        assertEquals(expectedData.getEmail(),actualData.getEmail());
        assertEquals(expectedData.getImageUrl(),actualData.getImageUrl());
        assertEquals(expectedData.getLangKey(),actualData.getLangKey());
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getLastModifiedBy(),actualData.getLastModifiedBy());
        assertEquals(expectedData.getLastModifiedDate(),actualData.getLastModifiedDate());
        assertEquals(expectedData.getAuthorities().get(0),actualData.getAuthorities().get(0));
        assertEquals(expectedData.getPassword(),actualData.getPassword());



    }
}