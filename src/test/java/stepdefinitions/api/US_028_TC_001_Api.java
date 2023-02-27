package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.MessagePojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US_028_TC_001_Api {
    MessagePojo expectedData;
    MessagePojo actualData;
    Response response;

    @Given("user sends post request {string} to create message")
    public void userSendsPostRequestToCreateMessage(String endpoint) {

        expectedData=new MessagePojo("arasataman@gmailcom","new appointment on 23/03/2023","aras","appointment");

        response = given().when().contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateTokenForAdmin()).post(endpoint);

        System.out.println(expectedData);

        assertEquals(201, response.getStatusCode());

    }
    @Then("user gets the message data to read")
    public void user_gets_the_message_data_to_read() throws JsonProcessingException {
        actualData= new ObjectMapper().readValue(response.asString(), MessagePojo.class);
        Assert.assertEquals(expectedData.getEmail(),actualData.getEmail());
        Assert.assertEquals(expectedData.getName(),actualData.getName());
        Assert.assertEquals(expectedData.getMessage(),actualData.getMessage());
        Assert.assertEquals(expectedData.getSubject(),actualData.getSubject());
    }



}
