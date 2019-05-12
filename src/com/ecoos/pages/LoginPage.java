package com.ecoos.pages;

import org.openqa.selenium.WebDriver;
import com.ecoos.locator.LoginLocator;
import com.ecoos.utilities.Actions;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void loginToSite (String UserName, String Password) {

	try {	
	
		 Actions.sendKeys(LoginLocator.UserName, UserName);
		 Actions.Wait(10);

		 Actions.sendKeys(LoginLocator.Password, Password);
		 Actions.Wait(10);
	
		Actions.click(LoginLocator.LoginButton);
		Actions.Wait(10);
	    
	    Actions.clear(LoginLocator.Password);
	    Actions.clear(LoginLocator.UserName);
	
					
	}catch(Exception e)	{
		System.out.println("Ex: Login :  "+e.getMessage());
		
	}
	}
	
}
