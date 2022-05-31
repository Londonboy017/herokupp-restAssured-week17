package com.herokuapp.testBase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    
    }
}
