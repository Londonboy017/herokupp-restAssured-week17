package com.herokuapp.testpackage;

import com.herokuapp.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetBookingIds extends TestBase {
    @Test
    public void getAllRecord() {
        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
