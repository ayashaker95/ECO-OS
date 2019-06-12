package com.ecoos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//		 Thread.sleep(500);
		 
		 /*WebDriverWait wait = new WebDriverWait(driver, 15);
	     WebElement elementTOcheck = driver.findElement(LoginLocator.Password);
		wait.until(ExpectedConditions.visibilityOf(elementTOcheck));*/
		 Actions.sendKeys(LoginLocator.Password, Password);

		
	
		Actions.click(LoginLocator.LoginButton);
//		Thread.sleep(6000);
		//Actions.Wait(10);
	    
	    Actions.clear(LoginLocator.Password);
	    Actions.clear(LoginLocator.UserName);
	
					
	}catch(Exception e)	{
		System.out.println("Ex: Login :  "+e.getMessage());
		
	}
	}
	
}
