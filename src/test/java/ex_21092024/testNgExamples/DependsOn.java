package ex_21092024.testNgExamples;

import org.testng.annotations.Test;

public class DependsOn {

    @Test
    public void serverStartedOk(){
        System.out.println("run first");
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void test_method1(){
        System.out.println("method01");
    }
}
