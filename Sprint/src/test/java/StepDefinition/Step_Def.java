package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_Def{
	
	WebDriver driver;
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
	    
	}

	@When("User clicks on the register")
	public void user_clicks_on_the_register() {
		driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
	   
	}

	@When("User enter the account details")
	public void user_enter_the_account_details() {
		driver.findElement(By.id("firstname")).sendKeys("Hari");
		driver.findElement(By.id("lastname")).sendKeys("jack");
		driver.findElement(By.id("Email")).sendKeys("123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("8455hhhh@@");
	}
	

	@When("User clicks on the Register button")
	public void user_clicks_on_the_register_button() {
		driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();
	   
	}

	@Then("Account is Registered")
	public void account_is_registered() throws InterruptedException {
		
		Thread.sleep(15000);
		driver.quit();
	    
	}
	
	

	@When("User enter the Business account details")
	public void user_enter_the_business_account_details() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"businessaccount-radio\"]")).click();
		driver.findElement(By.id("businessName")).sendKeys("watchmec");
		driver.findElement(By.id("businessEmail")).sendKeys("watchmec@gmail.com");
		driver.findElement(By.id("bizPassword")).sendKeys("775hhhh@@");
		Thread.sleep(15000);
		
	   
	}
	@When("click on Register button")
	public void click_on_register_button() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"BUSINESS_REG_FORM_SUBMIT\"]")).click();
		Thread.sleep(7000);
	    
	}

	@Then("Business account is Registered")
	public void business_account_is_registered()  {
		
		driver.quit();
		
		
	}



	
	    
	}
	
