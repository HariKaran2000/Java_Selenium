package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/Features",
		glue = "StepDefinition",
		
		plugin = {"pretty","html:target/HTMLReport.html","json:target/cucumber.json"}
		
		
		)
public class Test_Runner extends AbstractTestNGCucumberTests{

}
