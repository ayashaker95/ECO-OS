package com.ecoos.tests;

import org.testng.annotations.Test;
import com.ecoos.base.BaseTest;
import com.ecoos.locator.AssetMenuLocator;
import com.ecoos.pages.AssetMenu;;


public class AssetMenuTest extends BaseTest {
	
	@Test
	public void SetParameters(){
	AssetMenu Menu = new AssetMenu();
	Menu.SetParamBtn(AssetMenuLocator.SetParam);
	
	}	
	@Test
	public void SelectAllDPs(){
	AssetMenu Menu = new AssetMenu();
	Menu.SelectAllDPs(AssetMenuLocator.setAll);
	}
	@Test
	public void clickapplyBtn(){
	AssetMenu Menu = new AssetMenu();
	Menu.ClickApplybtn(AssetMenuLocator.Apply);
	}
	@Test
	public void OpenSection(){
	AssetMenu Menu = new AssetMenu();
	Menu.OpenSection(AssetMenuLocator.section2);
	}
}
