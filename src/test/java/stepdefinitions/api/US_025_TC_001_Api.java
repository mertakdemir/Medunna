package stepdefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import org.codehaus.jackson.map.ObjectMapper;
import pojos.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AuthenticationMedunna.generateTokenForDoctor;
import static utilities.AuthenticationMedunna.generateTokenForPatient;

public class US_025_TC_001_Api {

    RequestSpecification spec;
    RequestSpecification specTestResult;

    Country countryPojo;
    CState cStatePojo;
    User userPhysicianPojo;
    User userPatientPojo;
    Patient patientPojo;
    Physician physicianPojo;
    PhysicianAppointment appointmentPojo;
    CTestPojo expectedData;
    CTestPojo actualData;

    C_Test_Result expectedTest1ResultData;
    C_Test_Result expectedTest2ResultData;

    List<C_Test_Result> expectedTestResultData;
    List<C_Test_Result> expectedTotalTestResultData;

    C_Test_Result[] actualTestResultData;

    Response response;
    Response responseTestResult;




    @Given("Set the url for Tests")
    public void setTheUrlForTests() {
        //SPEC-------->  with  CTest_ID
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/api").build();
        spec.pathParams("first", "c-tests", "second", 16259);
    }


    @Given("Set the url for Test Results")
    public void set_the_url_for_test_results() {
        //SPEC-------->  with  CTest_ID
        specTestResult = new RequestSpecBuilder().setBaseUri("https://medunna.com/api/c-test-results").build();
        specTestResult.pathParams("first", "c-test", "second", 16259);
    }


    @When("Set the expected data with pojo for Tests")
    public void setTheExpectedDataWithPojoForTests() {
        //EXPECTED DATA
        countryPojo = new Country(7756,"USA");

        cStatePojo = new CState(17603, "OHIO", countryPojo);

        userPhysicianPojo = new User("anonymousUser", "2023-03-07T22:35:37.693990Z", 17903,
                                     "maria", "Maria", "Herman", "maria@herman.com",
                                     true, "en", null, null, "222-66-2228");

        userPatientPojo = new User("anonymousUser", "2023-03-07T21:09:36.264969Z", 17902,
                                   "candy", "Candy", "Little", "candy@little.com",
                                   true, "en", null, null, "222-66-2227") ;

        patientPojo = new Patient("candy","2023-03-07T21:15:25.089781Z", 16315,
                                  "Candy", "Little", null, "3453453456",
                                  null, null, null, "candy@little.com",
                                  null, userPatientPojo, null, null, null);

        physicianPojo = new Physician("adminteam01", "2023-03-07T22:51:32.584197Z", 18051,
                                      "Maria", "Herman", "1980-03-06T00:00:00Z",
                                      "3453453456", "MALE", "Apositive", "",
                                      "",userPhysicianPojo, "ALLERGY_IMMUNOLOGY", countryPojo,
                                       cStatePojo, 588.00, "",null);


        appointmentPojo = new PhysicianAppointment("candy","2023-03-07T22:45:54.604265Z", 16718,
                                                    "2023-03-09T00:00:00Z", "2023-03-09T01:00:00Z",
                                                    "COMPLETED", "Anamnesis-2","Treatment-2",
                                                    "Diagnosis-2", "Prescription-2",
                                                    "Description-2", physicianPojo, patientPojo,null);

        expectedData = new CTestPojo("maria", "2023-03-07T22:57:16.728723Z", 16259,
                                     "Test:167182023-03-07T22:57:16.728150Z", null,
                                     "2023-03-07T22:57:16.728145Z", appointmentPojo, null);


        System.out.println("Expected Data = " + expectedData);
    }


    @When("Set the expected data with pojo for Test Results")
    public  void set_the_expected_data_with_pojo_for_test_results() {
        //EXPECTED DATA
            // Test1 Result Expected Data
        expectedTest1ResultData = new C_Test_Result(16527, "Hb A1C (IFCC)",null, null,
                                                    "42.1", "20.2", 200.00, 16259,
                                                    "2023-03-07T22:57:16.728845Z");

            // Test2 Result Expected Data
        expectedTest2ResultData = new C_Test_Result(16528, "Insulin",null, null,
                                                    "24.9", "2.6", 250.00, 16259,
                                                    "2023-03-07T22:57:16.728845Z");

        System.out.println("expectedTestResultData = " + expectedTest1ResultData + "..."  + expectedTest2ResultData);

        List<C_Test_Result> expectedTestResultData =  new ArrayList<C_Test_Result>();
        expectedTestResultData.add(0,expectedTest1ResultData);
        expectedTestResultData.add(1, expectedTest2ResultData);

        int expectedSize = expectedTestResultData.size();
        System.out.println("expectedSize = " + expectedSize);
        System.out.println("Expected Test Result Data = " + expectedTestResultData);
    }


    @And("Send the request and get the response for Tests")
    public void sendTheRequestAndGetTheResponseForTests() {
        // REQUEST-RESPONCE
        response = given().
                contentType(ContentType.JSON).
                header("Authorization", "Bearer " + generateTokenForPatient()).
                auth().basic("candy", "User.123").
                spec(spec).
                when().
                get("/{first}/{second}");
        response.prettyPrint();

    }

    @When("Send the request and get the response for Test Results")
    public void send_the_request_and_get_the_response_for_test_results() {
        // REQUEST-RESPONCE TEST RESULT
        responseTestResult = given().
                contentType(ContentType.JSON).
                header("Authorization", "Bearer " + generateTokenForPatient()).
                auth().basic("candy", "User.123").
                spec(specTestResult).
                when().
                get("/{first}/{second}");
        responseTestResult.prettyPrint();
    }


    @And("Get the actual data for Tests")
    public void getTheActualDataForTests() throws IOException {
        //ACTUAL DATA
        ObjectMapper objectMapper = new ObjectMapper();
        actualData = objectMapper.readValue(response.asString(), CTestPojo.class);
        System.out.println("Actual Data = " + actualData);

    }

    @When("Get the actual data for Test Results")
    public void get_the_actual_data_for_test_request() throws IOException {
        ObjectMapper object = new ObjectMapper();
        actualTestResultData = object.readValue(responseTestResult.asString(), C_Test_Result[].class);
        System.out.println("Actual Test Result Data = " + Arrays.toString(actualTestResultData)); //Arrays yazdirmak icin toString() methodu kullanilir.
    }

    @Then("Do assertion for Tests")
    public void doAssertionForTests() {
        //  VERIFY-ASSERT
        assertEquals(200, response.getStatusCode());
        assertEquals(expectedData.getAppointment().getId(),actualData.getAppointment().getId()); //---> AppointmentID
        assertEquals(expectedData.getId(), actualData.getId()); //------->>> C_Test ID


    }

    @Then("Do assertion for Test Results")
    public void do_assertion_for_test_results() {

        List<C_Test_Result> expectedTotalTestResultData =  new ArrayList<C_Test_Result>();
        expectedTotalTestResultData.add(0,expectedTest1ResultData);
        expectedTotalTestResultData.add(1, expectedTest2ResultData);

        assertEquals(200, responseTestResult.getStatusCode());


        System.out.println("expectedTest1ResultData = " + expectedTest1ResultData);
        System.out.println("expectedTest2ResultData = " + expectedTest2ResultData);
        System.out.println("Expected Total Test Result Data = " + expectedTotalTestResultData);


        //verify number of test types
        int expectedSize =expectedTotalTestResultData.size();
        int actualSize = actualTestResultData.length;
        System.out.println("Size = " + expectedSize + "..." + actualSize);

        // verify  with --------->>>>>> Test Type ID
        assertEquals(expectedTotalTestResultData.get(0).getId(),
                     Arrays.stream(actualTestResultData).toList().get(0).getId());


        // verify  with --------->>>>>> Test Name
        assertEquals(expectedTotalTestResultData.get(0).getName(),
                Arrays.stream(actualTestResultData).toList().get(0).getName());

        // verify same appointment's tests in actualTestResultData
        assertEquals(Arrays.stream(actualTestResultData).toList().get(0).getTestId(),
                Arrays.stream(actualTestResultData).toList().get(1).getTestId());


        // verify same appointment's tests in expectedTotalTestResultData
        assertEquals(expectedTotalTestResultData.get(0).getTestId(),
        expectedTotalTestResultData.get(1).getTestId());

    }

    public List<C_Test_Result> getExpectedData() {
        // Test1 Result Expected Data
        expectedTest1ResultData = new C_Test_Result(16527, "Hb A1C (IFCC)",null, null,
                "42.1", "20.2", 200.00, 16259,
                "2023-03-07T22:57:16.728845Z");

        // Test2 Result Expected Data
        expectedTest2ResultData = new C_Test_Result(16528, "Insulin",null, null,
                "24.9", "2.6", 250.00, 16259,
                "2023-03-07T22:57:16.728845Z");

        System.out.println("expectedTestResultData = " + expectedTest1ResultData + "..."  + expectedTest2ResultData);

        List<C_Test_Result> expectedTestResultData =  new ArrayList<C_Test_Result>();
        expectedTestResultData.add(0,expectedTest1ResultData);
        expectedTestResultData.add(1, expectedTest2ResultData);

        int expectedSize = expectedTestResultData.size();
        System.out.println("expectedSize = " + expectedSize);
        System.out.println("Expected Test Result Data = " + expectedTestResultData);

       return expectedTestResultData;
    }


    @And("Do assertion with expected_method")
    public void doAssertionWithExpected_method() {
        System.out.println("expectedTestResultData With Method = " + getExpectedData());
        assertEquals(getExpectedData().get(0).getName(),
                Arrays.stream(actualTestResultData).toList().get(0).getName());
    }
}

