package com.ecoos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
			Actions.Wait(7);	
	}catch(Exception e)	{
		System.out.println("Ex: OpenReview :  "+e.getMessage());
		
	}
  }
	
	public void OpenAnalyze() {
		try {
			// open Analazye 
			Actions.click(CollectLocator.analyze);
			Actions.Wait(10);
	}catch(Exception e)	{
		System.out.println("Ex: OpenAnalyze :  "+ e.getMessage());
		
	}
  }
	
	public void OpenReport() {
		try {
			
			// open  report 
			Actions.click(CollectLocator.report);
			Actions.Wait(7);
	}catch(Exception e)	{
		System.out.println("Ex: OpenReport :  "+e.getMessage());
		
	}
  }	
	public void OpenCollect() {
		try {
			// open collect
			Actions.click(CollectLocator.collect);
			Actions.Wait(7);
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
			Actions.Wait(7);
			
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
			Actions.Wait(7);
			
		}catch(Exception e)	{
			System.out.println("Ex: FilterByYear :  "+e.getMessage());
			
		}
	}
	
	public void OpenCategory() {
		try {
			// open any category like Energy (related to protocol and site )
			Actions.click(CollectLocator.Eng_category);
			Actions.Wait(7);
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
			Actions.Wait(6);
			
			
	}catch(Exception e)	{
		System.out.println("Ex: SelectAsset :  "+e.getMessage());
		
	}
	}

}

