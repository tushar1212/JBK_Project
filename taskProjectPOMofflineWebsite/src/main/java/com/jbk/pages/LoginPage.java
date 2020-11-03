package com.jbk.pages;

import org.openqa.selenium.WebDriver;

import com.jbk.objectRepository.RegPageRepository;
 

public class LoginPage extends RegPageRepository {
boolean r;
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		public boolean getText(){
		String Newgen = newRegLink.getText();
		String expectedtxt="Register a new membership";
		System.out.println(Newgen);
		if(Newgen.equals(expectedtxt)){
			r=true;
		}
		else 
			r=false;
		
		return r;
		
	}

	public boolean clickBtn()   {
		newRegLink.click();
		String expectedurl="file:///C:/Offline%20website/index.html";
		String acturl=driver.getCurrentUrl();
		System.out.println(acturl + "  " + expectedurl);
		if(acturl.equals(expectedurl)){
			r=true;
		}
		else r=false;
		
		return r;
	}
	
	
 
}
