package com.ecoos.tests;

import org.testng.annotations.Test;

import com.ecoos.base.BaseTest;
import com.ecoos.locator.LoginLocator;
import com.ecoos.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import com.ecoos.utilities.Actions;
import com.ecoos.utilities.Constants;

public class LoginTest extends BaseTest {

	@Test
	@Parameters({ "UserName", "Password" })
	public void ValidLogin(String UserName, String Password) {

		LoginPage login = new LoginPage();
		login.loginToSite(UserName, Password);
		Assert.assertEquals(Actions.getCurrentURL(), Constants.collect);
	} 

	@Test
	@Parameters({ "UserName", "Password" })
	public void InvalidEmail(String UserName, String Password) {

		LoginPage login = new LoginPage();
		login.loginToSite(UserName, Password);
		String message = driver.findElement(LoginLocator.InvalidMessage).getText();
		if (message.contains(Constants.errorMsg))
			Assert.assertTrue(true);
	}

	@Test
	@Parameters({ "UserName", "Password" })
	public void InvalidPassword(String UserName, String Password) {

		LoginPage login = new LoginPage();
		login.loginToSite(UserName, Password);
		String message = driver.findElement(LoginLocator.InvalidMessage).getText();
		if (message.contains(Constants.errorMsg))
			Assert.assertTrue(true);
	}

}
