package stepdefinitions.api;


import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.AppointmentPostRequestPojo;
import utilities.JsonUtils;
import static io.restassured.RestAssured.given;



public class US_006_TC_001_Api {

    RequestSpecification spec;
    Response response;
    AppointmentPostRequestPojo appointmentPostRequestPojo = new AppointmentPostRequestPojo();
    AppointmentPostRequestPojo actualData;

    @Given("Set the necessary path params to create an Appointment")
    public void set_the_necessary_path_params_to_create_an_appointment() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "appointments", "third", "request");
    }
    @Given("Set the expected data with valid credentials {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void set_the_expected_data_with_valid_credentials(String string, String birthDate, String appointmentEmail, String firstName, String gender, String lastName, String phoneNumber, String sNumber, String appointmentSSN, String startDate) {
        appointmentPostRequestPojo.setAppoSpeciality(string);
        appointmentPostRequestPojo.setBirthDate(birthDate);
        appointmentPostRequestPojo.setAppointmentEmail(appointmentEmail);
        appointmentPostRequestPojo.setFirstName(firstName);
        appointmentPostRequestPojo.setGender(gender);
        appointmentPostRequestPojo.setLastName(lastName);
        appointmentPostRequestPojo.setPhone(phoneNumber);
        appointmentPostRequestPojo.setSnumber(sNumber);
        appointmentPostRequestPojo.setAppointmentSsn(appointmentSSN);
        appointmentPostRequestPojo.setStartDate(startDate);

    }
    @Given("Send the Post Request and get the response")
    public void send_the_post_request_and_get_the_response() {
        Response response = given().spec(spec).contentType(ContentType.JSON).body(appointmentPostRequestPojo).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Then("Verify the Status Code is {int}")
    public void verify_the_status_code_is(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
    @Then("Verify actual data's are matching with expected data's")
    public void verify_actual_data_s_are_matching_with_expected_data_s() {
        actualData = JsonUtils.convertJsonToJava(response.asString(), AppointmentPostRequestPojo.class);
        Assert.assertEquals(appointmentPostRequestPojo.getAppointmentEmail(), actualData.getAppointmentEmail());
        Assert.assertEquals(appointmentPostRequestPojo.getFirstName(), actualData.getFirstName());
        Assert.assertEquals(appointmentPostRequestPojo.getLastName(), actualData.getLastName());
        Assert.assertEquals(appointmentPostRequestPojo.getGender(), actualData.getGender());
        Assert.assertEquals(appointmentPostRequestPojo.getPhone(), actualData.getPhone());
        Assert.assertEquals(appointmentPostRequestPojo.getSnumber(), actualData.getSnumber());
        Assert.assertEquals(appointmentPostRequestPojo.getAppointmentSsn(), actualData.getAppointmentSsn());
        Assert.assertEquals(appointmentPostRequestPojo.getStartDate(), actualData.getStartDate());
    }



}

