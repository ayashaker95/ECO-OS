package com.ecoos.tests;

import org.testng.annotations.Test;

import com.ecoos.base.BaseTest;
import com.ecoos.locator.LoginLocator;
import com.ecoos.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.Assert;

public class LoginTest extends BaseTest {
	
  @Test
  @Parameters({"UserName","Password"})
  public void ValidLogin( String UserName, String Password) { 

	  LoginPage login = new LoginPage(driver);
	  login.loginToSite(UserName,Password);
	  System.out.println("user name is  "+UserName);
	  String URL = driver.getCurrentUrl();
	  Assert.assertEquals(URL, "http://172.22.1.107/dashboard/collect" );
	
  }
  
  @Test
  @Parameters({"UserName","Password"})
  public void InvalidEmail( String UserName, String Password) { 

	  LoginPage login = new LoginPage(driver);
	  login.loginToSite(UserName,Password);
	  System.out.println("user name is  "+UserName);
	  String message = driver.findElement(LoginLocator.InvalidMessage).getText();
      if (message.contains("Invalid Username or Password. Please Try Again!"))
          Assert.assertTrue(true);
  }
  
  @Test
  @Parameters({"UserName","Password"})
  public void InvalidPassword( String UserName, String Password) { 

	  LoginPage login = new LoginPage(driver);
	  login.loginToSite(UserName,Password);
	  System.out.println("user name is  "+UserName);
	  String message = driver.findElement(LoginLocator.InvalidMessage).getText();
      if (message.contains("Invalid Username or Password. Please Try Again!"))
          Assert.assertTrue(true);
  }

}




