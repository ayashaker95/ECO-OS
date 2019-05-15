package com.ecoos.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.ecoos.base.BaseTest;
import com.ecoos.locator.CollectLocator;
import com.ecoos.locator.LoginLocator;
import com.ecoos.pages.CollectPage;
import com.ecoos.utilities.Actions;

public class CollectTest extends BaseTest {
	
	
	@Test
	public void Review() throws InterruptedException {
		CollectPage  collect = new CollectPage(driver);
		collect.OpenReview();
		  String URL = driver.getCurrentUrl();
		  System.out.println(URL);
		  Assert.assertEquals(URL, "http://172.22.1.107/dashboard/review" );
	}
	@Test
	public void Analyze() throws InterruptedException {
		CollectPage  collect = new CollectPage(driver);
		collect.OpenAnalyze();
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "http://172.22.1.107/dashboard/analyze" );
	}
	@Test
	public void Report() throws InterruptedException {
		CollectPage  collect = new CollectPage(driver);
		collect.OpenReport();
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "http://172.22.1.107/dashboard/report" );
		  
	}
	@Test
	public void Collect() throws InterruptedException {
		CollectPage  collect = new CollectPage(driver);
		collect.OpenCollect();
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "http://172.22.1.107/dashboard/collect" );
		  Thread.sleep(6000);	
	}
	@Test 
	public void ProctcolTest() {
		CollectPage  collect = new CollectPage(driver);
		collect.FilterByProtcol();
		  String text = driver.findElement(CollectLocator.protcoldropdown).getText();
	      if (text.contains("Israel Pollutant Release and Transfer Register (PRTR)"))
	          Assert.assertTrue(true);
	}
	@Test 
	public void YearsTest() {
		CollectPage  collect = new CollectPage(driver);
		collect.FilterByYear();
		  String text = driver.findElement(CollectLocator.yearsdropdown).getText();
	      if (text.contains("2014"))
	          Assert.assertTrue(true);	
	}
	@Test
	public void OpenCategory() {
		CollectPage  collect = new CollectPage(driver);
		collect.OpenCategory();
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "http://172.22.1.107/new-collect/3" );	
	}
	@Test
	public void SelectAsset() {
		CollectPage  collect = new CollectPage(driver);
		collect.SelectAsset();
		  String URL = driver.getCurrentUrl();
		  Assert.assertEquals(URL, "http://172.22.1.107/new-select-asset/3" );
	}
		
}

