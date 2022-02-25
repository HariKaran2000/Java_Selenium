//package Assignment;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Ques1 {
//
//	public static void main(String[] args)throws InterruptedException  {
//		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.ebay.com/");
//		driver.findElement(By.xpath("//*[@id=\"gh-minicart-hover\"]/div/a[1]")).click();
//		
//		/*driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[2]/div[1]/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"s0-27-9-0-1[0]-0-1[0]-0-18-list\"]/li[1]/a/div/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"s0-27_2-9-0-1[0]-0-1\"]/ul/li[1]/div/div[1]/div/a/div/div/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"isCartBtn_btn\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[1]/button")).click();
//		driver.findElement(By.id("gxo-btn")).click();
//		
//		/*driver.findElement(By.id("userid")).sendKeys("harikaran289@gmail.com");
//		driver.findElement(By.id("signin-continue-btn")).click();
//		driver.findElement(By.id("pass")).sendKeys("Itsmehari@23");
//		driver.findElement(By.id("sgnBt")).click();
//		*/
//		//Thread.sleep(5000);
//		//driver.quit();
//
//	}
//	/*
//	 * Feature: Register Functionality
//Scenario: To verify user is able to Register For Personal account
//Given  User is in the home page
//When  User clicks on the register
//And  User enter the account details
//And  User clicks on the Register button
//Then  Account is Registered
//
//
//Scenario: To verify user is able to Register for Business account
//Given  User is in the home page
//When  User clicks on the register
//And  User enter the Business account details
//And  click on Register button
//Then  Business account is Registered
//
//
//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.core.cli.Main;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Step_Def{
//	
//	WebDriver driver;
//	@Given("User is in the home page")
//	public void user_is_in_the_home_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.ebay.com/");
//	    
//	}
//
//	@When("User clicks on the register")
//	public void user_clicks_on_the_register() {
//		driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
//	   
//	}
//
//	@When("User enter the account details")
//	public void user_enter_the_account_details() {
//		driver.findElement(By.id("firstname")).sendKeys("Hari");
//		driver.findElement(By.id("lastname")).sendKeys("jack");
//		driver.findElement(By.id("Email")).sendKeys("123@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("8455hhhh@@");
//	}
//	
//
//	@When("User clicks on the Register button")
//	public void user_clicks_on_the_register_button() {
//		driver.findElement(By.xpath("//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")).click();
//	   
//	}
//
//	@Then("Account is Registered")
//	public void account_is_registered() throws InterruptedException {
//		
//		Thread.sleep(15000);
//		driver.quit();
//	    
//	}
//	
//	
//
//	@When("User enter the Business account details")
//	public void user_enter_the_business_account_details() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"businessaccount-radio\"]")).click();
//		driver.findElement(By.id("businessName")).sendKeys("watchmec");
//		driver.findElement(By.id("businessEmail")).sendKeys("watchmec@gmail.com");
//		driver.findElement(By.id("bizPassword")).sendKeys("775hhhh@@");
//		Thread.sleep(15000);
//		
//	   
//	}
//	@When("click on Register button")
//	public void click_on_register_button() throws InterruptedException {
//		driver.findElement(By.xpath("//*[@id=\"BUSINESS_REG_FORM_SUBMIT\"]")).click();
//		Thread.sleep(7000);
//	    
//	}
//
//	@Then("Business account is Registered")
//	public void business_account_is_registered()  {
//		
//		driver.quit();
//		
//		
//	}
//
//
//
//	
//	    
//	}
//	
//
//	 */
//
//}


