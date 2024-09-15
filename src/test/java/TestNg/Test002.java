package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test002 {

    //BeforeSuite
    //BeforeTest
    //BeforeClass
    //BeforeMethod
    //Test
    //After...

    @BeforeSuite
    void demo1(){
        System.out.println("Before suite");
    }

    @AfterSuite
    void demo4(){
        System.out.println("After suite");
    }
}
