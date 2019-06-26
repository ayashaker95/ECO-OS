package com.ecoos.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.ecoos.locator.HomePageLocator;
import com.ecoos.locator.SelectAssetLocator;
import com.ecoos.utilities.Constants;

public class SelectAsset extends Actions {

	public void assetControl() {

		try {
			boolean visible = driver.findElement(SelectAssetLocator.SelectAssetsButton).isDisplayed();
			if (visible) {
				WebElement SelectAssetBtn = driver.findElement(SelectAssetLocator.SelectAssetsButton);
				SelectAssetBtn.click();
			} else {
				WebElement AssetToolCollapse = driver.findElement(SelectAssetLocator.assetToolsCollapse);
				AssetToolCollapse.click();

			}
		} catch (Exception e) {
			System.out.println("Ex: assetControl :  " + e.getMessage());

		}
	}

	public void SelectAll(By path) {
		try {
			clickElement(path);
			List<WebElement> list = driver.findElements(By.tagName("input"));
			for (WebElement ele : list.subList(2, list.size())) {
				String className = ele.getAttribute("class");
				System.out.println(className);
				Assert.assertEquals(className, Constants.ClassName4, "pass");
			}

		} catch (Exception ex) {
			System.out.println("Ex: SelectAll :  " + ex.getMessage());
		}
	}

	public void SelectChildasset(By path) {

		try {
			clickElement(SelectAssetLocator.SelectAll);
			Wait(path, 5);
			clickElement(path);
			List<WebElement> parentasset = driver.findElements(By.tagName("input"));
			for (WebElement parent : parentasset.subList(3, 4)) {
				String className = parent.getAttribute("class");
				System.out.println(className);
				Assert.assertEquals(className, Constants.ClassName5);
			}

		} catch (Exception ex) {
			System.out.println("Ex: SelectChildasset  :  " + ex.getMessage());
		}
	}

	public void SelectSecondasset(By path) {
		try {
			clickElement(SelectAssetLocator.Parentasset);
			clickElement(SelectAssetLocator.Childasset);
			Wait(path, 5);
			clickElement(path);

			List<WebElement> childasset = driver.findElements(By.tagName("input"));
			for (WebElement child : childasset.subList(3, 5)) {
				String className = child.getAttribute("class");
				System.out.println(className);
				if (className == Constants.ClassName6) {
					Assert.assertEquals(className, Constants.ClassName6);
				} else if (className == Constants.ClassName7) {
					Assert.assertEquals(className, Constants.ClassName7);
				}
			}
		} catch (Exception ex) {
			System.out.println("Ex: SelectSecondasset :  " + ex.getMessage());
		}
	}

	public void ClickApplyBtn(By path) {
		try {

			clickElement(path);

		} catch (Exception ex) {
			System.out.println("Ex: ClickApplyBtn :  " + ex.getMessage());
		}
	}
}
