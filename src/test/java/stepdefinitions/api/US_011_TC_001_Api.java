package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.*;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateTokenForDoctor;

public class US_011_TC_001_Api {

    RequestSpecification spec;

    Country countryPojo;
    User userPojo;
    Patient patientPojo;
    Physician physicianPojo;
    PhysicianAppointment expectedData;
    PhysicianAppointment expectedData1;

    Response response;

    PhysicianAppointment[] actualData;

    int totalAppointment;

    @Given("Set the url")
    public void set_the_url() {
        // SPEC
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();
        spec.pathParams("first", "appointments", "second", "bydateandId").
                queryParams("fromDate", "2023-03-02", "toDate", "2023-03-09", "userId", 9845);
    }

    @When("Set the expected data with pojo")
    public void set_the_expected_data_with_pojo() {
        // EXPECTED DATA

        countryPojo = new Country(7751, "Turkey");

        userPojo = new User("anonymousUser", "2023-02-27T02:53:36.966469Z", 9845,
                "minikserce", "Sezen", "Aksu", "sezen@gmail.com", true,
                "en", null, null, "222-66-2222");

        patientPojo = new Patient("ahbab", "2023-02-27T03:09:24.005168Z", 5978,
                "Harry", "Potter", null, "3453453456",
                "MALE", "Apositive", null, "haluk@gmail.com",
                null, userPojo, null, null, null);

        physicianPojo = new Physician("adminteam01", "2023-02-28T22:27:16.361498Z", 5216,
                "Sezen", "Aksu", "1978-06-26T23:00:00Z",
                "3453453456", "FEMALE", "Apositive", "",
                "", userPojo, "ALLERGY_IMMUNOLOGY", countryPojo,
                null, 100.00, "", "");


        expectedData = new PhysicianAppointment("ahbab", "2023-02-27T15:14:18.967289Z", 10091,
                "2023-03-07T00:00:00Z", "2023-03-07T01:00:00Z",
                "PENDING", "Hasta bilgisi ", "Inceleme yapliyor",
                "incelemeden sonra teshis konulacak.", null, null,
                physicianPojo, patientPojo, null);

        expectedData1 = new PhysicianAppointment("ahbab", "2023-02-27T03:10:54.282218Z", 10053,
                "2023-03-03T00:00:00Z", "2023-03-09T01:00:00Z",
                "PENDING", null, null, null,
                null, null,
                physicianPojo, patientPojo, null);


        System.out.println("expectedData = " + expectedData);

    }

    @When("Send the request and get the response")
    public void send_the_request_and_get_the_response()  {


        // REQUEST-RESPONCE
        response = given().
                contentType(ContentType.JSON).
                header("Authorization", "Bearer " + generateTokenForDoctor()).
                auth().basic("minikserce", "User.123").
                spec(spec).
                when().
                get("/{first}/{second}/");
        response.prettyPrint();
    }


    @When("Get the actual data")
    public void get_the_actual_data() throws JsonProcessingException {
    // ACTUAL DATA
        ObjectMapper mapper = new ObjectMapper();
        actualData = mapper.readValue(response.asString(), PhysicianAppointment[].class);
    }

    @Then("Do assertion how many appointments does the physician have")
    public void do_assertion_how_many_appointments_does_the_physician_have() {
        //  VERIFY-ASSERT
        assertEquals(200, response.getStatusCode());

        int totalAppointment = Arrays.stream(actualData).toList().size();
        System.out.println("Total Appointment = " + totalAppointment);

    }

    @Then("Do assertion patient id, start date, end date, status etc.")
    public void do_assertion_patient_id_start_date_end_date_status_etc() {
        // assert patient id


        // assert start date
        assertEquals(expectedData.getStartDate(), Arrays.stream(actualData).toList().get(0).getStartDate());

        //assert end date
        assertEquals(expectedData.getEndDate(), Arrays.stream(actualData).toList().get(0).getEndDate());

        // assert status
        for (int i = 0; i < totalAppointment; i++) {
            assertEquals(expectedData.getStatus(), Arrays.stream(actualData).toList().get(i).getStatus());
            assertEquals(expectedData1.getStatus(), Arrays.stream(actualData).toList().get(i).getStatus());
        }

        //assert physicianId
        assertEquals(expectedData.getPhysician().getUser().getId(),
                     Arrays.stream(actualData).toList().get(0).getPhysician().getUser().getId());

        //assert physicianFirstName
        assertEquals(expectedData.getPhysician().getFirstName(),
                     Arrays.stream(actualData).toList().get(0).getPhysician().getFirstName());
    }

    @Then("Do assertion patients' physician are the same")
    public void do_assertion_patients_physician_are_the_same() {
        //verify  patients' physician are the same
        assertEquals(Arrays.stream(actualData).toList().get(0).getPhysician().getFirstName(),
                     Arrays.stream(actualData).toList().get(1).getPhysician().getFirstName());

        System.out.println(Arrays.stream(actualData).toList());

    }
}
