package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="StepDefinitions",
		//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		//plugin={"pretty","json:target/cucumberReports.json"}
		//tags="@tag3",
		plugin={"pretty","junit:target/cucumberReports.xml"})  
public class EdurekaRunner {

}
