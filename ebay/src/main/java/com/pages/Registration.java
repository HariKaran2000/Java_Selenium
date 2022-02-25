package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.base;

public class Registration extends base {
	@FindBy(xpath = "//*[@id=\"gh-ug-flex\"]/a")
	WebElement register;
	
	@FindBy(id = "firstname")
	WebElement Fname;
	
	@FindBy(id = "lastname")
	WebElement Lname;
	
	@FindBy(id = "Email")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement pwd;
	
	@FindBy(xpath = "//*[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
	WebElement PRegister;
	
	@FindBy(xpath = "//*[@id=\"businessaccount-radio\"]")
	WebElement BusinessAcc;
	
	@FindBy(id = "businessName")
	WebElement Bname;
	
	@FindBy(id = "businessEmail")
	WebElement Bmail;
	
	@FindBy(id = "bizPassword")
	WebElement Bpwd;
	
	@FindBy(xpath = "//*[@id=\"BUSINESS_REG_FORM_SUBMIT\"]")
	WebElement BRegister;
	
	
	public Registration() {
		
	}
	
	base bs;
	public void HomePage() throws InterruptedException{
		bs = new base();
		bs.initialization();
		PageFactory.initElements(driver, this);
		Thread.sleep(2000);
	}
	
	public void Regi() throws InterruptedException { 
		Thread.sleep(2000);
		register.click();
		//pause();
		Thread.sleep(17000);
	}
	
	public void Paccount(String fname,String lname, String mail, String pass) throws InterruptedException{
		Fname.sendKeys(fname);
		//pause();
		Thread.sleep(3000);
		Lname.sendKeys(lname);
		//pause();
		Thread.sleep(3000);
		email.sendKeys(mail);
		//pause();
		Thread.sleep(3000);
		pwd.sendKeys(pass);
		//pause();
		Thread.sleep(6000);
	}
	
	
	public void Preg() throws InterruptedException{
		
	    PRegister.click();
	    Thread.sleep(17000);
	}
	

	
	public void Baccount() throws InterruptedException{
		pause();
		BusinessAcc.click();
		Thread.sleep(2000);
		Bname.sendKeys("watchmeck");
		Thread.sleep(2000);
		Bmail.sendKeys("watchmeck@gmail.com");
		Thread.sleep(2000);
		Bpwd.sendKeys("775hhhhk@@");
		Thread.sleep(2000);
	
	}
	
	public void Breg() throws InterruptedException {
		
		BRegister.click();
		Thread.sleep(17000);
			
	}
	

}
