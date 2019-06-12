package com.ecoos.utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.ecoos.base.BaseTest;

public class Actions extends BaseTest {

	public static void click(By Path) {
		WebDriverWait wait2 = new WebDriverWait(driver, 15);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(Path)));
		driver.findElement(Path).click();
	}

	public static void sendKeys(By Path, String dataInput) {
		driver.findElement(Path).sendKeys(dataInput);
	}

	public static void clear(By Path) {
		driver.findElement(Path).clear();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void Wait3(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public String getElementText(By path) {
		return driver.findElement(path).getText();
	}
	
	public  void selectFromList(By path , String option) {}
}
