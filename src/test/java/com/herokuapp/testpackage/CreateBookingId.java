package com.herokuapp.testpackage;

import com.herokuapp.model.UserPojo;
import com.herokuapp.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class CreateBookingId extends TestBase {
    @Test
    public void createNewBooking() {
        HashMap<Object, Object> bookingsDatesData = new HashMap<>();
        bookingsDatesData.put("checkin", "2018-09-11");
        bookingsDatesData.put("checkout", "2022-05-12");

        UserPojo userPojo = new UserPojo();
        userPojo.setFirstname("Jason");
        userPojo.setLastname("Brown");
        userPojo.setTotalprice(133);
        userPojo.setDepositpaid(true);
        userPojo.setBookingdates(bookingsDatesData);
        userPojo.setAdditionalneeds("Swimmig-pool");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(userPojo)
                .when()
                .post("/booking");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
