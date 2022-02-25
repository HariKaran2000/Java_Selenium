package com.pages;


import com.base.base;

public class Url_Page extends base {

	base bs;
	
	public void Browserurl() {
		
		bs = new base();
		bs.initialization();
		
	}
	public String BrowserTitle()  {
		
		pause();
		return driver.getTitle();
		
		
	}
	
	

}
