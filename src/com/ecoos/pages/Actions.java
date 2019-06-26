package com.ecoos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecoos.base.BaseTest;

public class Actions extends BaseTest {
	public void clickElement(By Path) {
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(Path)));
		driver.findElement(Path).click();
	}

	public void sendText(By Path, String dataInput) {
		driver.findElement(Path).sendKeys(dataInput);
	}

	public void clearElementText(By Path) {
		driver.findElement(Path).clear();
	}

	public void Wait(By Path, int TimeOut) {
		WebDriverWait wait = new WebDriverWait(driver, TimeOut);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(Path)));
	}

	public String getElementText(By path) {
		return driver.findElement(path).getText();
	}

	public void selectFromList(By path, String option) {

		WebElement selectListElement = driver.findElement(path);
		Select SelectList = new Select(selectListElement);
		SelectList.selectByVisibleText(option);
	}

	public String getCurrentURL() {
		String URL = driver.getCurrentUrl();
		return URL;
	}

	public void scrollDown(By path) {
		WebElement e = driver.findElement(path);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", e);

		if (e.isDisplayed()) {
			System.out.println("appear");
		} else {
			System.out.println("Error");
		}

	}

}
