package stepdefinitions.api;


import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.AppointmentPostRequestPojo;
import pojos.PostAppointmentPojo;

import static io.restassured.RestAssured.given;
import static utilities.UserAuthenticationMedunna.generateTokenForUser;

public class US_006_TC_001_Api {


    PostAppointmentPojo requestBody =new PostAppointmentPojo();
    AppointmentPostRequestPojo actualData;
    RequestSpecification spec;
    Response response;

    @Given("Set the necessary path params to create an Appointment")
    public void set_the_necessary_path_params_to_create_an_appointment() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
        spec.pathParams("first", "api", "second", "appointments", "third", "request");
    }

    /*
    @And("Set the expected data with valid credentials {string}, {string}, {string}, {string}, {string},{string}, {string}, {string}, {string}, {string}")

    public void setTheExpectedDataWithValidCredentials(String firstName, String lastName, String userSSN, String userEmail, String phoneNumber, String startDate, String string, String birthDate, String gender, String sNumber) {
        expectedData.setFirstName(firstName);
        expectedData.setLastName(lastName);
        expectedData.setAppointmentSsn(userSSN);
        expectedData.setAppointmentEmail(userEmail);
        expectedData.setPhone(phoneNumber);
        expectedData.setStartDate(startDate);
        expectedData.setAppoSpeciality(string);
        expectedData.setBirthDate(birthDate);
        expectedData.setGender(gender);
        expectedData.setSnumber(sNumber);
    }
    /*
     */


    /*@Given("Set the expected data with valid credentials {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void set_the_expected_data_with_valid_credentials(String string, String birthDate, String userEmail, String firstName, String gender, String lastName, String phoneNumber, String sNumber, String userSSN, String startDate) {
        expectedData.setFirstName(firstName);
        expectedData.setLastName(lastName);
        expectedData.setAppointmentSsn(userSSN);
        expectedData.setAppointmentEmail(userEmail);
        expectedData.setPhone(phoneNumber);
        expectedData.setStartDate(startDate);
        expectedData.setAppoSpeciality(string);
        expectedData.setBirthDate(birthDate);
        expectedData.setGender(gender);
        expectedData.setSnumber(sNumber);
        //expectedData = new AppointmentPostRequestPojo(string, birthDate, userEmail, firstName, gender, lastName, phoneNumber, sNumber, userSSN, startDate);
        response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    /*

     */

    @Given("Send the Post Request and get the response")
    public void send_the_post_request_and_get_the_response() {
        response = given().spec(spec).contentType(ContentType.JSON).body(requestBody).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("Verify the Status Code is {int}")
    public void verify_the_status_code_is(Integer int1) {

    }
    @Then("Verify actual data's are matching with expected data's")
    public void verify_actual_data_s_are_matching_with_expected_data_s() {

    }

}

