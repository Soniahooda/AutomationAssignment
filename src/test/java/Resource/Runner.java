package Resource;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "feature",
        glue = "",
//        tags = {"@OrderShirt"},
        plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
)


public class Runner {
    @AfterClass
    public static void report() {
        Reporter.loadXMLConfig(new File("env/extent-config.xml"));
    }


}
