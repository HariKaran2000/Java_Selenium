package com.pages;

import com.base.Base;

public class Url extends Base{
	
	Base bs;
	
	public void Browserurl() {
		
		bs = new Base();
		bs.initialization();
		
	}
	public String BrowserTitle()  {
		
		pause();
		return driver.getTitle();
		
		
	}
	
	

}
