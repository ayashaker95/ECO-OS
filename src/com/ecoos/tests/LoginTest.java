package com.ecoos.tests;

import org.testng.annotations.Test;

import com.ecoos.base.BaseTest;
import com.ecoos.locator.LoginLocator;
import com.ecoos.pages.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.Assert;

import com.ecoos.utilities.Constants;

public class LoginTest extends BaseTest {

	@Test
	@Parameters({ "UserName", "Password" })
	public void ValidLogin(String UserName, String Password) {

		LoginPage login = new LoginPage();
		login.clearLoginFields();
		login.loginToSite(UserName, Password);
		Assert.assertEquals(login.getCurrentURL(), Constants.Collect);
	}

	@Test
	@Parameters({ "UserName", "Password" })
	public void InvalidEmail(String UserName, String Password) {

		LoginPage login = new LoginPage();
		login.clearLoginFields();
		login.loginToSite(UserName, Password);
		String message = login.getElementText(LoginLocator.InvalidMessage);
		if (message.contains(Constants.ErrorMsg))
			Assert.assertTrue(true);
	}

	@Test
	@Parameters({ "UserName", "Password" })
	public void InvalidPassword(String UserName, String Password) {

		LoginPage login = new LoginPage();
		login.clearLoginFields();
		login.loginToSite(UserName, Password);
		String message = login.getElementText(LoginLocator.InvalidMessage);
		if (message.contains(Constants.ErrorMsg))
			Assert.assertTrue(true);
	}

}
