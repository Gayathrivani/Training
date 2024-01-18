package RunnerClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Feature/getMethod.feature","src/test/java/Feature/insertProduct.feature"},
        glue = {"steps"}
//        tags = "@Test"
)
public class testRunner extends AbstractTestNGCucumberTests {


}
