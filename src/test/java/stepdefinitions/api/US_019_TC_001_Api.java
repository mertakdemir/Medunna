package stepdefinitions.api;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;

import static base_url.MedunnaBaseUrlWithoutAnnotation.spec;
import static io.restassured.RestAssured.given;
import static utilities.AdminAuthenticationMedunna.generateTokenForAdmin;

public class US_019_TC_001_Api {

    Response response;
    @Given("Admin adds necessary path params to the base url")
    public void admin_adds_necessary_path_params_to_the_base_url() {
        spec.pathParams("first", "api", "second", "physicians");
    }

    @And("Admin sends the Get request and get the response")
    public void adminSendsTheGetRequestAndGetTheResponse() {
        response = given().spec(spec).headers("Authorization","Bearer "+generateTokenForAdmin()).when().get("/{first}/{second}");
        response.prettyPrint();
    }
    @Then("Admin verifies that the status code is {int}")
    public void admin_verifies_that_the_status_code_is(int statusCode) {
        Assert.assertEquals(200, statusCode);
    }
}
