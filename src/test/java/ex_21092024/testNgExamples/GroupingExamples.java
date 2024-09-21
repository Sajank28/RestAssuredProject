package ex_21092024.testNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingExamples {

    @Test(groups = {"QA","preprod"})
    public void sanityRun(){
        System.out.println("Sanity");
    }

    @Test(groups = "dev")
    public void smokeRun(){
        Assert.assertEquals(true, true);
        System.out.println("Smoke");
    }

}
