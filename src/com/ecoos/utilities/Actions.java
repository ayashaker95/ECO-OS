package com.ecoos.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ecoos.base.BaseTest;

public class Actions extends BaseTest {

	public static void clickElement(By Path) {
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(Path)));
		driver.findElement(Path).click();
	}

	public static void sendKeys(By Path, String dataInput) {
		driver.findElement(Path).sendKeys(dataInput);
	}

	public static void clear(By Path) {
		driver.findElement(Path).clear();
	}

	public static void Wait(By Path) {
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(Path)));
	}

	public String getElementText(By path) {
		return driver.findElement(path).getText();
	}
	
	public static void selectFromList(By path , String option) {
		
		WebElement  protcoldropdown = driver.findElement(path);
		Select Promenu = new Select(protcoldropdown);
		Promenu.selectByVisibleText(option);
	}

	public static String getCurrentURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}
	
	public static void openCategory(By Path) {
		WebElement category = driver.findElement(Path) ;
		category.click();
	}
	
	public static String getText(By path) {
		String x = driver.findElement(path).getText();
		return x;
	}
	public static void SelectAssets(By path) {
	    WebElement seletasset = driver.findElement(path);
	    seletasset.click();
		
	}

	public static void scrollDown(By path) {
		WebElement e = driver.findElement(path);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", e);
		
		if (e.isDisplayed()) {
			System.out.println("appear");
		}else {
			System.out.println("Error");
		}
		
	}
	public static void selectdatapoints(By path) {
		WebElement datapoint = driver.findElement(path);
		datapoint.click();
		
		
	}
	
}
