package SelBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

 

public class LaunchingApplication
{
    public static void main(String[] args) throws InterruptedException
    {
    	WebDriverManager.chromedriver().setup();

 

        ChromeOptions options = new ChromeOptions();

 

        options.addArguments("start-maximized");

 

        options.addArguments("disable-infobars");
        
        options.addArguments("--disable-extensions");
        
        WebDriver driver = new ChromeDriver(options);
        
        driver.get("https://www.ebay.com/");
        driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
        Thread.sleep(2000);
		driver.findElement(By.id("userid")).sendKeys("harikaran289@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Itsmehari@23");
		driver.findElement(By.id("sgnBt")).click();
		Thread.sleep(20000);
		driver.close();        
      
       // driver.findElement(By.id("gh-ac")).sendKeys("laptop");
        
        new WebDriverWait(driver, 50).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]") ));
        
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click();

 

    }
}
    

		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.id("userid")).sendKeys("harikaran");
		driver.findElement(By.id("signin-continue-btn")).click();
		driver.findElement(By.id("pass")).sendKeys("harikaran");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	