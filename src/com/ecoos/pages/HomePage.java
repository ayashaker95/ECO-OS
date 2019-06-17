package com.ecoos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ecoos.utilities.Actions;


public class HomePage {

	WebDriver driver;

	public void switchMainTabs(By Path) {
		try {
			Actions.clickElement(Path);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Ex: switchTabs :  " + e.getMessage());

		}
	}

	public void dropDownList(By path, String option) {
		try {
			Actions.selectFromList(path, option);

		} catch (Exception e) {
			System.out.println("Ex: dropDownList :  " + e.getMessage());
		}
	}

	public void OpenCategory(By path) {
		try {
			Actions.openCategory(path);
			Actions.Wait(path);

		} catch (Exception e) {
			System.out.println("Ex: OpenCategory :  " + e.getMessage());
		}
	}
	

	/*
	 * public void uploadLogo() { try { WebElement Logo =
	 * driver.findElement(CollectLocator.logo); Logo.click(); Thread.sleep(500);
	 * WebElement selection_file =
	 * driver.findElement(CollectLocator.selection_file);
	 * selection_file.sendKeys("c:\\logo_big.png"); WebElement uploadBtn =
	 * driver.findElement(CollectLocator.uploadBtn); uploadBtn.click();
	 * Thread.sleep(1000);
	 * 
	 * } catch (Exception e) { System.out.println("Ex: uplaod logo :  " +
	 * e.getMessage());
	 * 
	 * }
	 * 
	 * }
	 */

}
