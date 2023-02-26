package stepdefinitions.api;


import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.AppointmentResponsePojo;
import pojos.PostAppointmentPojo;
import utilities.JsonUtils;

import static base_url.MedunnaBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US_006_TC_001_Api {

    Response response;
    Response response2;
    PostAppointmentPojo expectedData;
    AppointmentResponsePojo actualData;
    JsonPath json;


    @Given("User adds the necessary path params to the base url")
    public void user_adds_the_necessary_path_params_to_the_base_url() {

        spec.pathParams("first", "api", "second", "appointments", "third", "request");
    }
    @Given("User sets the expected data")
    public void user_sets_the_expected_data() {
        expectedData = new PostAppointmentPojo();
        expectedData.setFirstName("Leo");
        expectedData.setLastName("Caprio");
        expectedData.setSsn("345-66-7346");
        expectedData.setEmail("leocaprioo@gmail.com");
        expectedData.setPhone("644-231-5879");
        expectedData.setStartDate("2024-02-21T00:00:00Z");
        expectedData.setAppoSpeciality("string");
        expectedData.setBirthDate("2000-02-21T16:34:31.108Z");
        expectedData.setGender("male");
        expectedData.setSnumber("string");
    }
    @Given("User sends the post request and gets the response")
    public void user_sends_the_post_request_and_gets_the_response() {
        response = given().spec(spec).headers("Authorization", "Bearer "+generateTokenForAdmin()).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("verify that status code is {int}")
    public void verify_that_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
    @Then("Do assertion according to post request")
    public void do_assertion_according_to_post_request() {
       json = response.jsonPath();
       Assert.assertEquals(expectedData.getFirstName(), json.getString("patient.firstName"));
       Assert.assertEquals(expectedData.getSsn(), json.getString("patient.user.ssn"));
       Assert.assertEquals(expectedData.getLastName(), json.getString("patient.lastName"));
       Assert.assertEquals(expectedData.getEmail(), json.getString("patient.email"));
       Assert.assertEquals(expectedData.getPhone(), json.getString("patient.phone"));
       Assert.assertEquals(expectedData.getStartDate(), json.getString("startDate"));
    }
    @Given("User adds the necessary path params to the base url for Get Request")
    public void user_adds_the_necessary_path_params_to_the_base_url_for_get_request() {
        int id = json.getInt("id");
        spec.pathParams("first", "api", "second", "appointments", "third", id);
    }
    @Given("User sends the Get request and gets the response")
    public void user_sends_the_get_request_and_gets_the_response() {

        response2 = given().spec(spec).headers("Authorization", "Bearer "+generateTokenForAdmin()).when().get("/{first}/{second}/{third}");
        response2.prettyPrint();
    }
    @Then("Verify that status code is {int}")
    public void Verify_that_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode, response2.statusCode());
    }
    @Then("Do assertion according to Get request")
    public void do_assertion_according_to_get_request() {
        actualData = JsonUtils.convertJsonToJava(response2.asString(), AppointmentResponsePojo.class);
        Assert.assertEquals(expectedData.getFirstName(), actualData.getPatient().getFirstName());
        Assert.assertEquals(expectedData.getSsn(), actualData.getPatient().getUser().getSsn());
        Assert.assertEquals(expectedData.getLastName(), actualData.getPatient().getLastName());
        Assert.assertEquals(expectedData.getEmail(), actualData.getPatient().getUser().getEmail());
        Assert.assertEquals(expectedData.getPhone(), actualData.getPatient().getPhone());
        Assert.assertEquals(expectedData.getStartDate(), actualData.getStartDate());

    }




}