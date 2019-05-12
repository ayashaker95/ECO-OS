package com.ecoos.locator;

import org.openqa.selenium.By;

public class LoginLocator {
	
	public static By LoginButton  = By.xpath("//button");
	public static By UserName = By.xpath("//input[@id='Username']");
	public static By Password = By.xpath("//input[@id='Password']");
	public static By InvalidMessage = By.xpath("//div[@class='error-message ng-binding']");
}
