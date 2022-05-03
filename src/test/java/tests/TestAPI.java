package tests;
import io.qameta.allure.Description;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static io.restassured.RestAssured.*;

@DisplayName("First test")
public class TestAPI {

    @Test
    @Description("Get response for allure result")
    public void getForReqres(){
        Response response = given().
                    baseUri("https://reqres.in/").
                when().
                    get("/api/users?page=2").
                then().log().all().
                    extract().response();
    }

    @Test
    @Description("Should see 400 for GET response for allure result")
    public void shouldSee400GetForReqres(){
        Response response = given().
                baseUri("https://reqres.in/").
                contentType(ContentType.JSON).
                when().
                get("/api/users/wer").
                then().statusCode(200).log().all().
                extract().response();
    }
}
