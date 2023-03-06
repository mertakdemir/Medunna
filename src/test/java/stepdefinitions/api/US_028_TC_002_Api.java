package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.response.Response;
import org.junit.Assert;
import pojos.MessageGetPojo;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US_028_TC_002_Api {
    MessageGetPojo expectedData;
    MessageGetPojo actualData;
    Response response;
    @Given("user sends get request {string} to read message")
    public void userSendsGetPostRequestToReadMessage(String endpoint) {

        expectedData=new MessageGetPojo("arasataman@gmailcom",8974,"new appointment on 23/03/2023","aras","appointment");

        response = given().when().headers("Authorization","Bearer "+generateTokenForAdmin()).get(endpoint);
        response.prettyPrint();
        System.out.println(expectedData);

        assertEquals(200, response.getStatusCode());

    }
    @Then("user verify gets the message data to read")
    public void user_verify_gets_the_message_data_to_read() throws JsonProcessingException {
        actualData= new ObjectMapper().readValue(response.asString(), MessageGetPojo.class);
        Assert.assertEquals(expectedData.getEmail(),actualData.getEmail());
        Assert.assertEquals(expectedData.getName(),actualData.getName());
        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());
        Assert.assertEquals(expectedData.getSubject(),actualData.getSubject());
    }



}

