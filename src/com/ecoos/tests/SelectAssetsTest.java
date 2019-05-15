package com.ecoos.tests;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.ecoos.base.BaseTest;
import com.ecoos.pages.SelectAsset;
public class SelectAssetsTest  extends BaseTest {
	
	@Test 
	public void SelectAll(){
		SelectAsset asset = new SelectAsset(driver);
		asset.SelectAll();
	}
	@Test
	public void SelectChild(){
		SelectAsset asset = new SelectAsset(driver);
		asset.Selectasset();
	}
	@Test
	public void SelectSecondChild(){
		SelectAsset asset = new SelectAsset(driver);
		asset.SelectSecondasset();
	}
	@Test
	public void ClickApply(){
		SelectAsset asset = new SelectAsset(driver);
		asset.ClickApply();
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "http://172.22.1.107/new-collect/3");
	}
}
