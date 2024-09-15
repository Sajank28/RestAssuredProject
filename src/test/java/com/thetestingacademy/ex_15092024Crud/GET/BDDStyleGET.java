package com.thetestingacademy.ex_15092024Crud.GET;

import io.restassured.RestAssured;

public class BDDStyleGET {
    public static void main(String[] args) {

        //When -?
        // PAyload -? no/yes - JSON.xml


        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking").log().all()
                .when()
                    .log().all()
                    .get()
                .then().log().all()
                    .statusCode(200);
    }
}
