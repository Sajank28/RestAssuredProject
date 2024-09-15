package TestNg;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Test001 {

    @Test
    public void test_get(){
        RestAssured
                .given().relaxedHTTPSValidation()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/997").log().all()
                .when().log().all()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
