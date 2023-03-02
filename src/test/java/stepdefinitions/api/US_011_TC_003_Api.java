package stepdefinitions.api;

import base_url.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.MessagePojo;
import pojos.PhysicianAppointment;

import static base_url.MedunnaBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.*;
import static utilities.AuthenticationMedunna.generateTokenForDoctor;

public class US_011_TC_003_Api {

    PhysicianAppointment expectedData;
    PhysicianAppointment actualData;
    Response response;

    @Given("user \\(doctor) get request for appointment list")
    public void user_doctor_get_request_for_appointment_list() {

    spec.pathParams("first", "api", "second", "appointments", "third", "bydateandId").
            queryParams("fromDate", "2023-03-02", "toDate","2023-03-03", "userId", 9845);

    response= given().
                contentType(ContentType.JSON).
                header("Authorization", "Bearer " +generateTokenForDoctor()).
                auth().basic("minikserce", "User.123").
           //     spec(spec).
               // body(expectedData).
                when().
                get("/{first}/{second}/{third}");
        response.prettyPrint();

        //https://medunna.com/api/appointments/bydateandId?fromDate=2023-03-02&toDate=2023-03-03&userId=9845

    }
}
