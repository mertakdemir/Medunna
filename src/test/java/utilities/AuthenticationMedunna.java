package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {

    public static String generateTokenForDoctor() {

        Map<String, Object> gmi = new HashMap<>();
        gmi.put("password", "User.123");
        gmi.put("rememberMe", true);
        gmi.put("username", "minikserce");

        Response response = given().contentType(ContentType.JSON).body(gmi).when().post("https://medunna.com/api/authenticate");
        response.prettyPrint();

        return response.jsonPath().getString("id_token");
    }

    public static String generateTokenForStaff() {

        Map<String, Object> gmi = new HashMap<>();
        gmi.put("password", "ferid03?");
        gmi.put("rememberMe", true);
        gmi.put("username", "ferid");

        Response response = given().contentType(ContentType.JSON).body(gmi).when().post("https://medunna.com/api/authenticate");
        response.prettyPrint();

        return response.jsonPath().getString("id_token");
    }
/*
STAFF
1-isim:Feride Toprak
SNN: 581-01-0303
İD:12491
mail: ferid@gmail.com

username:ferid
pasword : ferid03?

 */

}
