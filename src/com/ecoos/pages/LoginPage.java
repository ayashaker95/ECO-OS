package com.ecoos.pages;

import org.openqa.selenium.WebDriver;
import com.ecoos.locator.LoginLocator;
import com.ecoos.utilities.Actions;

public class LoginPage {
	WebDriver driver;

	public void loginToSite(String UserName, String Password) {

		try {

			Actions.sendKeys(LoginLocator.UserName, UserName);
			Actions.sendKeys(LoginLocator.Password, Password);
			Actions.clickElement(LoginLocator.LoginButton);
			Actions.clear(LoginLocator.Password);
			Actions.clear(LoginLocator.UserName);

		} catch (Exception e) {
			System.out.println("Ex: Login :  " + e.getMessage());

		}
	}
}
