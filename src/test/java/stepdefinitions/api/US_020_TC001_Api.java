package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.*;
import utilities.AuthenticationMedunna;
import utilities.JsonUtils;

import java.util.Optional;

import static base_url.MedunnaBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;
import static utilities.AuthenticationMedunna.generateTokenForStaff;

public class US_020_TC001_Api {

    StaffPojo expectedData;
    User user =new User();
    CState cState = new CState();
    Country country=new Country();
    Response response;
    Response response2;
    StaffPojo actualData;
    int staffId;

  /*
  https://medunna.com/api/staff/22120

{
    "createdBy": "adminteam01",
    "createdDate": "2023-03-13T09:53:24.060094Z",
    "id": 22120,
    "firstName": "Feride Su",
    "lastName": "Toprak",
    "birthDate": "2003-03-12T23:00:00Z",
    "phone": "9954333347",
    "gender": "FEMALE",
    "bloodGroup": "Apositive",
    "adress": "Emel street. 6/6",
    "description": "new nurse",
    "user": {
        "createdBy": "anonymousUser",
        "createdDate": "2023-03-01T15:44:06.774843Z",
        "id": 12493,
        "login": "su",
        "firstName": "Feride",
        "lastName": "",
        "email": "su@gmail.com",
        "activated": true,
        "langKey": "en",
        "imageUrl": null,
        "resetDate": null,
        "ssn": "581-01-0304"
    },
    "country": {
        "id": 7751,
        "name": "Turkey"
    },
    "cstate": null
}
   */
    @Given("user sends the GET request for created sataff data to the url")
    public void user_sends_the_get_request_for_created_sataff_data_to_the_url() {
//      staffId =22120;
        staffId =22123;
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "staff", "third", staffId);
/*
        country.setName("Turkey");
        user.setActivated(true);
        user.setLogin("su");
        user.setSsn("581-01-0304");
        expectedData = new StaffPojo("Emel street. 6/6","2003-03-12T23:00:00Z","Apositive",country,"adminteam01","2023-03-13T09:53:24.060094Z",cState,"new nurse","Feride Su","FEMALE",22120,"FEMALE","9954333347",user);

 */

        country.setName("Turkey");
        user.setActivated(true);
        user.setLogin("nicos");
        user.setSsn("186-09-5438");
        expectedData = new StaffPojo("Emel street.","2023-03-12T23:00:00Z","Apositive",country,"adminteam01","2023-03-13T14:16:00.159959Z",cState,"new nurse","Nicolas","MALE",22123,"Toprak","9954333345",user);

        /*
        expectedData.setAdress("Emel street. 6/6");
        expectedData.setBirthDate("2003-03-12T23:00:00Z");
        expectedData.setBloodGroup("Apositive");
        expectedData.setCountry(country);
        expectedData.setDescription("new nurse");
        expectedData.setCreatedDate("2023-03-13T09:53:24.060094Z");
        expectedData.setCstate(cState);
        expectedData.setFirstName("Feride Su");
        expectedData.setGender("FEMALE");
        expectedData.setLastName("Toprak");
        expectedData.setPhone("9954333347");
        expectedData.setSsn("581-01-0304");
        expectedData.setUser(user);

        */

        System.out.println(expectedData);


        response = given().
                spec(spec).
                header("Authorization","Bearer "+generateTokenForAdmin()).
                when().get("/{first}/{second}/{third}");
        //response.prettyPrint();
    }

    @Then("verify HTTP status code is {int} of staff get request")
    public void verify_http_status_code_is_of_staff_get_request(int statusCode1) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
 //       actualData = mapper.readValue(response.asString(), StaffPojo.class);

        actualData = response.as(StaffPojo.class);
        System.out.println("actualData = " + actualData);

       assertEquals(statusCode1,response.getStatusCode());
    }



    @Then("sends DELETE request for created sataff data to the url")
    public void sends_delete_request_for_created_sataff_data_to_the_url() {
        spec.pathParams("first", "api", "second", "appointments", "third", staffId);

        response2 = given().spec(spec).header("Authorization","Bearer "+generateTokenForAdmin()).when().delete("/{first}/{second}/{third}");
        response2.prettyPrint();
    }

    @Then("verify HTTP status code is {int} of staff delete request")
    public void verify_http_status_code_is_of_staff_delete_request(int statusCode2) {
     assertEquals(statusCode2,response2.statusCode());
        assertEquals(expectedData, actualData);
    }





}
