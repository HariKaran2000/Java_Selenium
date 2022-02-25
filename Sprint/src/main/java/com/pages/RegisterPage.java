package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.Base;

public class RegisterPage extends Base {
	
	@FindBy(id = "firstname")
	WebElement fname;
	
	@FindBy(id = "lastname")
	WebElement lname ;
	
	
	@FindBy(id = "password")
	WebElement pword;
	
	@FindBy(id = "Email")
	WebElement email;
	
	
	
	public void registerPage() {
		
	}
	public void Validateregister(String FName,String LName,String Email,String pwd) {
		
				
		
	}
	
	

}
