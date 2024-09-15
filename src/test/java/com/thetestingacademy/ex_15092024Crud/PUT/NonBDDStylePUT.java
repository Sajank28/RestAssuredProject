package com.thetestingacademy.ex_15092024Crud.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NonBDDStylePUT {
    //6118
    //token
    /*payload{
    "firstname" : "James",
    "lastname" : "Brown",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}
    */

    //POST - AUTH - Token
    //POST - BOOKING ID
    //PUT - Token and bookingID

    public void get_token(){

    }

    public void get_booking_id(){

    }

    @Test
    public void test_put_positive_Tc() {

        //Auth - using POST
        String payload = "{ \n " +
                "\"username\" : \"admin\",\n" +
                "\"password\" : \"password123\"\n" +
                "}";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON).log().all();
        requestSpecification.body(payload);


        Response response = requestSpecification.when().post();

        // Then - validationResponse
        ValidatableResponse validatableResponse = response.then();
        validatableResponse.statusCode(200);

        //-------------------------------------------------------------

        //Create Booking ID - POST
        String payload2 = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload2);

        Response response1 = requestSpecification.when().log().all().post();

        // Then - validationResponse
        ValidatableResponse validatableResponse1 = response.then().log().all();
        validatableResponse1.statusCode(200);

        //-------------------------------------------------------

        //PUT - Token and bookingID
//        requestSpecification.basePath("/booking/")
    }
}
