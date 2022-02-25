package SelBasics;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args)throws InterruptedException {
		/*
		 * How to identify an element
		 * anything which is displayed on the UI, is called as a WebElement
		 * finding an element will return a webelement
		 * 
		 * Webelements priority for automation
		 * id >> priority 1
		 * name >> priority 2 
		 * class name --not prefered
		 * xpath >> priority 3
		 * Full
		 * /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input
		 * 
		 * Copy Xpath
		 * //*[@id="email"]
		 * 
		 * css >> priority 3
		 * #pass
		 * 
		 * tagname - not recommended
		 * 
		 * URL
		 * linktext - priority1 - exact match
		 * partiallinktext - priority2
		 * username >> Shilpa
		 * Forgotten password Shilpa?
		 * 
		 * Xpath
		 * findElement
		 * findElements
		 * 
		 */
		
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("username");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Password");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		*/ //driver.findElement(By.linkText("Forgotten")).click();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("harikaran289@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("itsmehari");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
