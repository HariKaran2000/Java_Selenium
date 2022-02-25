package Step_Def;
import org.testng.AssertJUnit;


import com.pages.Url_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Url_Page_Step_Def {
	Url_Page lp;
	
	@Given("User is in the Login Page")
	public void user_is_in_the_login_page() {
		lp = new Url_Page();
		lp.Browserurl();
	    
	}

	
	//@SuppressWarnings("deprecation")
	@Then("The title of the page should be {string}")
	public void the_title_of_the_page_should_be(String expectedTitle)  {
		String actualTitle = lp.BrowserTitle();
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
		
		lp.tearDown();
	   
	}

}
