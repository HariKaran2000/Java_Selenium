package myRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "C:\\Users\\HARIKARAN\\eclipse-workspace\\ebay\\src\\test\\java\\Features",
		glue = "Step_Def",
		dryRun = false,
		
		plugin= { "pretty","html:target/AdvanceReport/ebay.html",
						  "json:target/cucumber1/cucumber.json"}
		
		
		
		
		)
////import org.junit.runner.RunWith;
//
////import io.cucumber.junit.Cucumber;
////import io.cucumber.junit.CucumberOptions;
//
////@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "C:\\Users\\nikhi\\eclipse-workspace\\OrangeHRM_TestNG_Sprint2\\src\\test\\java\\Features",
//		glue = "StepDefinition",
//		dryRun = false,
//		//plugin = {"html:Reports/HTMLReport.html",
//		//		"json:Reports/Jsonreport.json",
//		//		"junit:Reports/JUnitReport.xml"}
//		
//		//)
//		
//		plugin= { "pretty","html:target/AdvanceReport/OrangeHRM.html",
//				  "json:target/cucumber1/cucumber.json"}
//		)

public class MyTestRunner extends AbstractTestNGCucumberTests {

}
