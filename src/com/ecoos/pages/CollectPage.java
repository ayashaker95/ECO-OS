package com.ecoos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecoos.locator.AssetMenuLocator;
import com.ecoos.locator.CollectLocator;
import com.ecoos.utilities.Actions;

public class CollectPage {
	
	WebDriver driver;
	
	public CollectPage(WebDriver driver) {
		this.driver = driver;
	}

	public void OpenReview() {
		try {
			// open review 
			Actions.click(CollectLocator.review);
			Thread.sleep(9000);	
	}catch(Exception e)	{
		System.out.println("Ex: OpenReview :  "+e.getMessage());
		
	}
  }
	
	public void OpenAnalyze() {
		try {
			// open Analazye 
			Actions.click(CollectLocator.analyze);
			WebDriverWait some_element = new WebDriverWait(driver,100); 
			some_element.until(ExpectedConditions.visibilityOfElementLocated(CollectLocator.protcolinfo));
	}catch(Exception e)	{
		System.out.println("Ex: OpenAnalyze :  "+ e.getMessage());
		
	}
  }
	
	public void OpenReport() {
		try {
			
			// open  report 
			Actions.click(CollectLocator.report);
			Thread.sleep(7000);	
	}catch(Exception e)	{
		System.out.println("Ex: OpenReport :  "+e.getMessage());
		
	}
  }	
	public void OpenCollect() {
		try {
			// open collect
			Actions.click(CollectLocator.collect);
			Thread.sleep(5000);	
	}catch(Exception e)	{
		System.out.println("Ex: OpenCollect :  "+e.getMessage());
		
	}
  }
	
	public void FilterByProtcol() {
		try {	
			
			//filter by protcol
			WebElement  protcoldropdown = driver.findElement(CollectLocator.protcoldropdown);
			Select Promenu = new Select(protcoldropdown);
			Promenu.selectByVisibleText("Israel Pollutant Release and Transfer Register (PRTR)");
			Thread.sleep(6000);	
			
		}catch(Exception e)	{
			System.out.println("Ex: FilterByProtcol :  "+e.getMessage());
			
		}
		
	}
	public void FilterByYear() {
		try {
			//filter by year
			WebElement  years = driver.findElement(CollectLocator.yearsdropdown);
			Select yearsmenu= new Select(years);
			yearsmenu.selectByVisibleText("2014");
			Thread.sleep(6000);	
			
		}catch(Exception e)	{
			System.out.println("Ex: FilterByYear :  "+e.getMessage());
			
		}
	}
	public void uploadLogo() {
		try {
			WebElement Logo = driver.findElement(CollectLocator.logo);
			Logo.click();
			Thread.sleep(500);
			WebElement selection_file = driver.findElement(CollectLocator.selection_file);
			selection_file.sendKeys("c:\\logo_big.png");
			WebElement uploadBtn = driver.findElement(CollectLocator.uploadBtn);
			uploadBtn.click();
			Thread.sleep(1000);
			
		}catch(Exception e)	{
			System.out.println("Ex: uplaod logo :  "+e.getMessage());
			
		}
		
	}
	
	public void OpenCategory() {
		try {
			// open any category like Energy (related to protocol and site )
			Actions.click(CollectLocator.Eng_category);
			Thread.sleep(8000);
		}catch(Exception e)	{
			System.out.println("Ex: OpenCategory :  "+e.getMessage());
			
		}
	}
	
	public void SelectAsset() {
		try {
			//Select asset 
			WebElement AssetToolCollapse = driver.findElement(CollectLocator.assetToolsCollapse);
			String classname = AssetToolCollapse.getAttribute("Class");
			if (classname != "fa fa-angle-double-up") {
				AssetToolCollapse.click();
			}
			WebElement SelectAssetBtn = driver.findElement(CollectLocator.SelectAssetsButton);
			SelectAssetBtn.click();
			System.out.println(classname);
			Thread.sleep(8000);
			//Actions.Wait(6);
			
			
			
	}catch(Exception e)	{
		System.out.println("Ex: SelectAsset :  "+e.getMessage());
		
	}
	}

}

