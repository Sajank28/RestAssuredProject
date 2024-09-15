package com.thetestingacademy.ex_15092024Crud.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDDStylePUT {
    public static void main(String[] args) {

        String payload;
        String auth1 =  "{ \n " +
                "\"username\" : \"admin\",\n" +
                "\"password\" : \"password123\"\n" +
                "}";

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking/1")
                .contentType(ContentType.JSON)
//                .body(payload)
                .when()
                    .put()
                .then()
                    .statusCode(201);
    }
}
