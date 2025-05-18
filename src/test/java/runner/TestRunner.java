package runner;

// here is the code implementation of Runner Class
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  //Path to your feature files
        glue ="steps" , // Package containg step definitions
        plugin = {"pretty","html:target/cucumber-reports.html"}, //Report Generation
        monochrome = true // Makes Output Readable

)

public class TestRunner {
    // Test Runner Implementations
}