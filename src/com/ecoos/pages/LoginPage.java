package com.ecoos.pages;

import org.openqa.selenium.By;

import com.ecoos.locator.LoginLocator;
import com.ecoos.pages.Actions;

public class LoginPage extends Actions {

	public void clearLoginFields() {
		driver.findElement(LoginLocator.UserName).clear();
		driver.findElement(LoginLocator.Password).clear();
	}

	public void loginToSite(String UserName, String Password) {

		try {

			sendText(LoginLocator.UserName, UserName);
			sendText(LoginLocator.Password, Password);
			clickElement(LoginLocator.LoginButton);

		} catch (Exception e) {
			System.out.println("Ex: Login :  " + e.getMessage());

		}
	}
}

//div[@class='collect-categories']/div[contains(@class,"collect-category" + value + ")]"