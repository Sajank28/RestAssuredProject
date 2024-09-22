package ex_22092024.assertions;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.io.File;

public class Verification001 {

    @Test
    public void test_verify_assertj(){
        String name= "pramod";
        Assertions.assertThat(name).isNotNull();


        //
        File file = new File ("testdata.json");
        Assertions.assertThat(file).exists().isFile().canRead();
    }
}
