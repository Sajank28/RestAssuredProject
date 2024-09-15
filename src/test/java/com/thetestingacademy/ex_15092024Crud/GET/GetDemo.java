package com.thetestingacademy.ex_15092024Crud.GET;

import io.restassured.RestAssured;

public class GetDemo {
    public static void main(String[] args) {
        System.out.println("Rest Assured Test Case");

        System.out.println("Get Request Demo");

        //Gherkins Syntax
//        given() - url, headers, body and payload
//        when() - http methods - get, post, push, put and delete
//        then() - verify response er == ar

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1").log().all()
                .when()
                    .get()
                .then().log().all()
                    .statusCode(200);
    }
}
