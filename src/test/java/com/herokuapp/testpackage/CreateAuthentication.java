package com.herokuapp.testpackage;

import com.herokuapp.model.UserPojo;
import com.herokuapp.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateAuthentication extends TestBase {
    @Test
    public void createAuth() {
        UserPojo userPojo = new UserPojo();
        userPojo.setUsername("admin");
        userPojo.setPassword("password123");
        Response response = given()
                .header("Content-Type", "application/json")
                .body(userPojo)
                .when()
                .post("/auth");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
