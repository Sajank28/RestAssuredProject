package ex_22092024.pojos;

import com.google.gson.Gson;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HandlePayload {

    @Test
    public void payload(){
        //3 ways to add payload

        //1. String
        String payload = "{\n" +
                "                    \"username\" : \"admin\",\n" +
                "                    \"password\" : \"password123\"\n" +
                "                }";

        //2. Using HashMap
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("username","admin");
        map.put("password","password123");

        //body -> Map -> Inputstream
        // Add GSON/jacksonApi dependency to POM.xml

        //3. Class - pojo - plain object
        //using getters and setters
        BookingClass bookingClass = new BookingClass();
        bookingClass.setFirstname("pramod");
        bookingClass.setLastname("shree");
        bookingClass.setTotalprice(12566);
        bookingClass.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("24-10-2024");
        bookingDates.setCheckout("26-10-2024");

        bookingClass.setAdditionalneeds("breakfast");

        Gson gson = new Gson();
        String jsonStringPayload = gson.toJson(bookingClass);
        System.out.println(jsonStringPayload);

    }
}
