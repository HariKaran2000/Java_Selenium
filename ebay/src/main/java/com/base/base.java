package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.reporter.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public static WebDriver driver;
	public static Properties prop;

	
	public base() {
		prop = new Properties();
		try {
			
			FileInputStream fis = new FileInputStream("./src/main/java/com/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!!!");
		} catch (IOException e) {
			System.out.println("Unable to read the file!!!");
		}
	}
	
	public void initialization() {
		
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		
		
		
		driver.get(prop.getProperty("url"));
		
	}
	
	public void pause() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	public void tearDown(){
		
		driver.quit();
		
		
		
		
		
	}
	
	
}
