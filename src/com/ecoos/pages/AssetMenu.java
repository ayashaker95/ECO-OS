package com.ecoos.pages;

import java.util.List;
import org.testng.Assert;
import com.ecoos.locator.AssetMenuLocator;
import com.ecoos.utilities.Actions;
import com.ecoos.utilities.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssetMenu {

	WebDriver driver;

	public void SetParamBtn(By Path) {
		try {
			Actions.clickElement(Path);
		} catch (Exception ex) {
			System.out.println("Ex: SetParamBtn :  " + ex.getMessage());
		}
	}

	public void SelectAllDPs(By path) {

		try {
			Actions.selectdatapoints(path);
			Actions.Wait(path);
			List<WebElement> list = driver.findElements(AssetMenuLocator.inputs);
			for (WebElement ele : list.subList(3, list.size())) {
				String className = ele.getAttribute("class");
				Assert.assertEquals(className, Constants.className2, "pass");
			}

		} catch (Exception ex) {
			System.out.println("Ex: SetAllparameters :  " + ex.getMessage());
		}
	}

	public void OpenSection(By path) {
		try {
			Actions.clickElement(path);
			Actions.Wait(path);

		} catch (Exception ex) {
			System.out.println("Ex: opensection:  " + ex.getMessage());
		}
	}

	public void ClickApplybtn(By path) {
		try {
			Actions.clickElement(path);
			Actions.Wait(path);

		} catch (Exception ex) {
			System.out.println("Ex: ClickApplybtn:  " + ex.getMessage());
		}
	}

}
