package stepdefinitions.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.MessagePojo;
import pojos.RegistrationPojo;
import pojos.RegistrationPostPojo;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US_001_TC_001_Api {

    /*
    {
  "activated": true,
  "authorities": [
    "string"
  ],
  "createdBy": "string",
  "createdDate": "2023-02-23T19:29:41.427Z",
  "email": "string",
  "firstName": "string",
  "id": 0,
  "imageUrl": "string",
  "langKey": "string",
  "lastModifiedBy": "string",
  "lastModifiedDate": "2023-02-23T19:29:41.428Z",
  "lastName": "string",
  "login": "string",
  "password": "string",
  "ssn": "string"
}
     */
    Faker faker=new Faker();
    RegistrationPostPojo expectedData;
    RegistrationPostPojo actualData;
    Response response;
    String username= faker.name().username();
    String name= faker.name().firstName();
    String lastName= faker.name().lastName();
    String ssn=faker.idNumber().ssnValid();
    String email=faker.internet().emailAddress();
    String password=faker.internet().password();


    @Given("send post request to {string} to create register")
    public void send_post_request_to_create_register(String endPointed)  {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("string");
        expectedData= new RegistrationPostPojo(true, arrayList, "string","2023-02-23T19:29:41.427Z",email,name,"string","string","string","2023-02-23T19:29:41.428Z",lastName,username,password,ssn);
        response = given().when().contentType(ContentType.JSON).body(expectedData).headers("Authorization","Bearer "+generateTokenForAdmin()).post(endPointed);
        System.out.println(expectedData);
        assertEquals(201, response.getStatusCode());
    }
    @Then("verifying all")
    public void verifying_all() throws JsonProcessingException {
        actualData= new ObjectMapper().readValue(response.asString(), RegistrationPostPojo.class);

        System.out.println(expectedData);

        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getSsn(),actualData.getSsn());
        assertEquals(expectedData.getEmail(),actualData.getEmail());
        assertEquals(expectedData.getLogin(),actualData.getLogin());
    }
}