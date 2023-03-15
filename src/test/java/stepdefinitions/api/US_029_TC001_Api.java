package stepdefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Country;
import pojos.CountryPostPojo;
import pojos.StaffPojo;

import java.util.Optional;

import static base_url.MedunnaBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US_029_TC001_Api {

    Country country =new Country();
    CountryPostPojo expectedData1;
    Country actualData;

    Country expectedPutData;
    Country actualPutData;

    Country expectedGetData;
    Country actualGetData;

    Country expectedDeleteData;
    Country actualDeleteData;

    Response response1;
    Response response2;
    Response response3;
    Response response4;

    int countryId;
//   POST REQUEST
    @Given("user sets the necessary path params to create a country")
    public void user_sets_the_necessary_path_params_to_create_a_country() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "countries");
    }
    @Given("sends POST request and get the response to create a country")
    public void sends_post_request_and_get_the_response_to_create_a_country() {
        expectedData1 =new CountryPostPojo("ITALY");
        System.out.println(expectedData1);


        response1 = given().
                spec(spec).
                header("Authorization","Bearer "+generateTokenForAdmin()).
                when().contentType(ContentType.JSON).body(expectedData1).post("/{first}/{second}");
        response1.prettyPrint();

    }
    @Then("verify HTTP status code is {int} of country post request")
    public void verify_http_status_code_is_of_country_post_request(Integer statusCode1) {

        actualData = response1.as(Country.class);
        System.out.println("actualData = " + actualData);

        assertEquals(201, response1.getStatusCode());

    }
/*

{
    "id": 24305,
    "name": "Italy"
}
 */
//   PUT REQUEST
     @Given("user sets the necessary path params to update a country")
      public void user_sets_the_necessary_path_params_to_ubdate_a_country() {
         spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
         spec.pathParams("first", "api", "second", "countries");
     }


    @Given("sends PUT request and get the response to update update existing countries")
    public void sends_put_request_and_get_the_response_to_update_update_existing_countries() {
        countryId = actualData.getId();

     expectedPutData = new Country(countryId,"Italy");
        System.out.println(expectedPutData);

        response2 = given().
                spec(spec).
                header("Authorization","Bearer "+generateTokenForAdmin()).
                when().contentType(ContentType.JSON).body(expectedPutData).put("/{first}/{second}");
        response2.prettyPrint();

    }

    @Then("verify HTTP status code is {int} of country put request")
    public void verify_http_status_code_is_of_country_put_request(Integer int1) {
        actualPutData = response2.as(Country.class);
        System.out.println("actualPutData = " + actualPutData);

        assertEquals(200,response2.getStatusCode());
    }

//   GET REQUEST

    @Given("user sets the necessary path params to get a country")
    public void user_sets_the_necessary_path_params_to_get_a_country() {


        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "countries","third",countryId);
    }
    @Given("user sends the GET request for created country data")
    public void user_sends_the_get_request_for_created_country_data() {
        expectedGetData = new Country(24305,"Italy");
        System.out.println(expectedGetData);

        response3 = given().
                spec(spec).
                header("Authorization","Bearer "+generateTokenForAdmin()).
                when().contentType(ContentType.JSON).body(expectedGetData).get("/{first}/{second}/{third}");
        response3.prettyPrint();

    }

    @Then("verify HTTP status code is {int} of country get request")
    public void verify_http_status_code_is_of_country_get_request(Integer int1) {
        actualGetData = response3.as(Country.class);
        System.out.println("actualGetData = " + actualGetData);

        Assert.assertEquals(200,response3.getStatusCode());
    }


//  DELETE REQUEST

    @Given("sends DELETE request for created country data to the url")
    public void sends_delete_request_for_created_country_data_to_the_url() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("first", "api", "second", "countries","third",countryId);

        expectedDeleteData = new Country(countryId,"Italy");
        System.out.println(expectedDeleteData);

        response4 = given().
                spec(spec).
                headers("Authorization","Bearer "+generateTokenForAdmin(),"Content-Type",ContentType.JSON,
                        "Accept", ContentType.JSON).
                when().contentType(ContentType.JSON).body(expectedDeleteData).delete("/{first}/{second}/{third}");
        response4.prettyPrint();

    }
    @Then("verify HTTP status code is {int} of country delete request")
    public void verify_http_status_code_is_of_country_delete_request(Integer int1) {

        Assert.assertEquals(204,response4.getStatusCode());
        //NOT: status code swagger'da 200 diyor
    }

}
