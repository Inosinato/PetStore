package base;

import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",   // Path to your feature files
        glue = "base.steps",            // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}