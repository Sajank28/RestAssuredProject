package ex_22092024.jsonpath;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

//3 Steps to test any API
    //1. Make a Request and get the response
    //2. Extract the data from the response
    //3. Verify the response

public class JsonPath01 {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;


    @Test
    public void getBookingId() {
        String payload_POST = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST).log().all();

        Response response = requestSpecification.when().post();

//        System.out.println(response.asString());

        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingId = jsonPath.getString("bookingid");
        String firstName = jsonPath.getString("booking.firstname");

        System.out.println(bookingId);
        System.out.println(firstName);

        Assertions.assertThat(bookingId).isNotNull().isNotNull();
        Assertions.assertThat(firstName).isNotNull().isEqualTo("Pramod");

    }

}
