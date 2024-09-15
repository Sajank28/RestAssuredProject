package com.thetestingacademy.ex_15092024Crud.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyleGET {
    public static void main(String[] args) {
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/1").log().all();
        r.when().get();
        r.then().log().all().statusCode(400);
    }
}
