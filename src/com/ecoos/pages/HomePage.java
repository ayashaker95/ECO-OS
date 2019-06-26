package com.ecoos.pages;

import org.openqa.selenium.By;
import com.ecoos.locator.HomePageLocator;
import com.ecoos.pages.Actions;

public class HomePage extends Actions {

	public void switchMainTabs(By Path) {
		try {
			clickElement(Path);
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Ex: switchTabs :  " + e.getMessage());
		}
	}

	public void seletcYear(By path, String year) {
		try {
			selectFromList(path, year);

		} catch (Exception e) {
			System.out.println("Ex: SelectYear :  " + e.getMessage());
		}
	}

	public void seletcProctol(By path, String protcol) {
		try {
			selectFromList(path, protcol);

		} catch (Exception e) {
			System.out.println("Ex: SelectProtcol :  " + e.getMessage());
		}
	}

	public String getCategoryName() {
		return null;

	}

	public void OpenCategory(By path) {
		try {
			clickElement(path);
			Wait(path, 10);

		} catch (Exception e) {
			System.out.println("Ex: OpenCategory :  " + e.getMessage());
		}
	}

	public void SelectAssets(By path) {
		try {
			clickElement(path);

		} catch (Exception e) {
			System.out.println("Ex: SelectAssets :  " + e.getMessage());
		}
	}

	public By gereateCategoryXpath(String categoryName) {

		return By.xpath(HomePageLocator.category + categoryName + "')]");
	}
	
	public By gereateTabsXpath(String tabName) {

		return By.xpath(HomePageLocator.tab + tabName + "']");
	}

}
