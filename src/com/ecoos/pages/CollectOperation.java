package com.ecoos.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.ecoos.locator.CollectOperationLocator;
import com.ecoos.utilities.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class CollectOperation {
	WebDriver driver;
	
	public void scrollDown(By path) {
		try {
			Actions.scrollDown(path);
		} catch (Exception ex) {
			System.out.println("Ex: scrollDown :  " + ex.getMessage());
		}
	}
	
	public void CheckDP(By path) {
		try {
		Thread.sleep(1000);
		Actions.clickElement(path);
		WebElement datapoint = driver.findElement(CollectOperationLocator.datapointResponse);
		String responseformat = datapoint.getAttribute("type");
		Assert.assertEquals(responseformat, "radio");
		Thread.sleep(1000);
	}catch(Exception ex)	{
		System.out.println("Ex: Check DP :  "+ex.getMessage());
	}	
	}
	
	/*public void Answer() {
		try {
			WebElement radiolabel  = driver.findElement(CollectOperationLocator.radiolabel);
			radiolabel.click();
			Thread.sleep(1000);
			WebElement save = driver.findElement(CollectOperationLocator.SaveBtn);
			save.click();
			
		}catch(Exception ex)	{
			System.out.println("Ex: Answer :  "+ex.getMessage());
		}
	}
	public void openTools() {
		try {
			
			driver.findElement(CollectOperationLocator.tools).click();
			Thread.sleep(600);
			driver.findElement(CollectOperationLocator.Ref).click();
			Thread.sleep(600);
			driver.findElement(CollectOperationLocator.info).click();
			
		}catch(Exception ex)	{
			System.out.println("Ex: tools :  "+ex.getMessage());
		}
	}*/
	
   }
