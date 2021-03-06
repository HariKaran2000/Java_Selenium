package com.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	//./src/main/java/com/config/config.properties
	
	public Base(){
		prop = new Properties(); 
		try {
			
			FileInputStream Fis = new FileInputStream("./src/main/java/com/config/config.properties");
			prop.load(Fis);
			
		}catch(FileNotFoundException e){
			System.out.println("File Not Found");
			
		}catch(IOException e) {
			System.out.println("Unable tto Read File");
		}
		}
	
	public void browserInitalization() {
		//logger = Logger.getLogger(Base.class);
		//logger.info("Trying to get the browser name");
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			//logger.info("Identified the browser as "+ browser);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			//logger.info("Identified the browser as "+ browser);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			//logger.info("Identified the browser as "+ browser);
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		//logger.info("Trying to launch the browser appplication");
		driver.get(prop.getProperty("url"));
		//logger.info("Appplication launched successfully");
	}
	
	public void WebBrowserClose() {
		driver.quit();
	}
		
	}
	
	
	
	


