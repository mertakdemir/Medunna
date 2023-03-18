package stepdefinitions.api;

import base_url.MedunnaBaseUrl;
import base_url.MedunnaBaseUrlWithoutAnnotation;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.TestItemsPostRequest;

import static base_url.MedunnaBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;


public class US_018_TC_001_Api {
    TestItemsPostRequest testItems = new TestItemsPostRequest();
    int price=   Faker.instance().number().numberBetween(50,50000);
    String name = "Bilal";
    Response response;
    @Given("user send post request to {string} to create test items")
    public void user_send_post_request_to_to_create_test_items(String string) {

       spec.pathParams("first","api","second","c-test-items");



     testItems.setPrice(price);
     testItems.setName(name);

     response=given().headers("Authorization","Bearer "+generateTokenForAdmin(),"Content-Type",ContentType.JSON,"Accept",ContentType.JSON).spec(spec).
             contentType(ContentType.JSON).
             body(testItems).post("/{first}/{second}");
     response.prettyPrint();




    }
    @Then("user get test items data and validates")
    public void user_get_test_items_data_and_validates() {
   assertEquals(200,response.getStatusCode());
//1.Validation
    response.then().assertThat().body("price",equalTo(price));
    response.then().assertThat().body("name",equalTo(name));


    }

}

