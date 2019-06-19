package com.ecoos.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.ecoos.locator.SelectAssetLocator;
import com.ecoos.utilities.Actions;
import com.ecoos.utilities.Constants;

public class SelectAsset {

	WebDriver driver;

	public void assetControl() {
		try {
			WebElement AssetToolCollapse = driver.findElement(SelectAssetLocator.assetToolsCollapse);
			String classname = AssetToolCollapse.getAttribute("Class");
			if (classname != Constants.className3) {
				AssetToolCollapse.click();
			}
			WebElement SelectAssetBtn = driver.findElement(SelectAssetLocator.SelectAssetsButton);
			SelectAssetBtn.click();
		} catch (Exception e) {
			System.out.println("Ex: SelectAsset :  " + e.getMessage());

		}
	}

	public void SelectAll(By path) {
		try {
			Actions.SelectAssets(path);
			List<WebElement> list = driver.findElements(By.tagName("input"));
			for (WebElement ele : list.subList(2, list.size())) {
				String className = ele.getAttribute("class");
				System.out.println(className);
				Assert.assertEquals(className, Constants.className4, "pass");
			}

		} catch (Exception ex) {
			System.out.println("Ex: SelectAll :  " + ex.getMessage());
		}
	}

	public void SelectChildasset(By path) {

		try {
			Actions.SelectAssets(SelectAssetLocator.SelectAll);
			Actions.Wait(path);
			Actions.SelectAssets(path);
			List<WebElement> parentasset = driver.findElements(By.tagName("input"));
			for (WebElement parent : parentasset.subList(3, 4)) {
				String className = parent.getAttribute("class");
				System.out.println(className);
				Assert.assertEquals(className, Constants.className5);
			}

		} catch (Exception ex) {
			System.out.println("Ex: SelectChildasset  :  " + ex.getMessage());
		}
	}

	public void SelectSecondasset(By path) {
		try {
			Actions.SelectAssets(SelectAssetLocator.Parentasset);
			Actions.SelectAssets(SelectAssetLocator.Childasset);
			Actions.Wait(path);
			Actions.SelectAssets(path);

			List<WebElement> childasset = driver.findElements(By.tagName("input"));
			for (WebElement child : childasset.subList(3, 5)) {
				String className = child.getAttribute("class");
				System.out.println(className);
				if (className == Constants.className6) {
					Assert.assertEquals(className, Constants.className6);
				} else if (className == Constants.className7) {
					Assert.assertEquals(className, Constants.className7);
				}
			}
		} catch (Exception ex) {
			System.out.println("Ex: SelectSecondasset :  " + ex.getMessage());
		}
	}
	public void ClickApplyBtn(By path) {
		try {
			
			Actions.clickElement(path);

		} catch (Exception ex) {
			System.out.println("Ex: ClickApplyBtn :  " + ex.getMessage());
		}
	}
}
