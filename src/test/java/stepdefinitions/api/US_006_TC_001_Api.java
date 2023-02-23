package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.AppointmentPostRequestPojo;
import pojos.RegistrationPojo;
import utilities.JSUtils;
import utilities.JsonUtils;

import static io.restassured.RestAssured.given;
import static utilities.UserAuthenticationMedunna.generateTokenForUser;


public class US_006_TC_001_Api {

    Response response;

    AppointmentPostRequestPojo expectedData;
    AppointmentPostRequestPojo actualData;

    @Given("Send the Post Request to the Appointment Post Request URL {string}")
    public void send_the_post_request_to_the_appointment_post_request_url(String endPoint) throws JsonProcessingException {

        expectedData = new AppointmentPostRequestPojo("string", "2023-02-22T20:29:50.827Z", "mertttdtt@gmail.com", "mert", "male", "sefa", "668-534-4131", "1231", "677-43-3654", "2023-02-22");
        response = given().contentType(ContentType.JSON).body(expectedData).when().post(endPoint);
        response.prettyPrint();


    }
    @Then("Verify the Status Code is {int}")
    public void verify_the_status_code_is(Integer statusCode) {
        actualData = JsonUtils.convertJsonToJava(response.asString(), AppointmentPostRequestPojo.class);
        Assert.assertEquals((int)statusCode, response.statusCode());
    }
    @Then("Verify that Appointment Post Request's actual data is matching with expected data")
    public void verify_that_appointment_post_request_s_actual_data_is_matching_with_expected_data() {

        actualData = JsonUtils.convertJsonToJava(response.asString(), AppointmentPostRequestPojo.class);
        //Assert.assertEquals(expectedData.getAppoSpeciality(), actualData.getAppoSpeciality());
        //Assert.assertEquals(expectedData.getBirthDate(), actualData.getBirthDate());
        Assert.assertEquals(expectedData.getAppointmentEmail(), actualData.getAppointmentEmail());
        Assert.assertEquals(expectedData.getFirstName(), actualData.getFirstName());
        //Assert.assertEquals(expectedData.getGender(), actualData.getGender());
        Assert.assertEquals(expectedData.getLastName(), actualData.getLastName());
        Assert.assertEquals(expectedData.getPhone(), actualData.getPhone());
        //Assert.assertEquals(expectedData.getSnumber(), actualData.getSnumber());
        Assert.assertEquals(expectedData.getAppointmentSsn(), actualData.getAppointmentSsn());
        //Assert.assertEquals(expectedData.getStartDate(), actualData.getStartDate());
    }
}
