package MyRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "./src/test/java/Features",
			glue = "StepDefinition",
			dryRun = true,
			plugin = {"html:Reports/HTMLReport.html",
					"json:Reports/Jsonreport.json",
					"junit:Reports/JUnitReport.xml"}
			
			)


public class TestRunner {

}
