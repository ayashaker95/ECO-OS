package com.ecoos.pages;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.testng.Assert;
import com.ecoos.locator.AssetMenuLocator;
import com.ecoos.utilities.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AssetMenu {
	WebDriver driver;
	
	public AssetMenu(WebDriver driver) {
		this.driver= driver;
	}
	
	public void Choose_asset() {
		try {
		WebElement Selasset = driver.findElement(By.className("selected"));
		Assert.assertTrue(Selasset != null);
		}catch(Exception ex)	{
			System.out.println("Ex: chooseasset :  "+ex.getMessage());
		}
	}
	public void SetParam() {
		try {
			
		WebElement setParameters = driver.findElement(AssetMenuLocator.setimg);
		setParameters.click();
	    Actions.Wait(10);
		}catch(Exception ex)	{
			System.out.println("Ex: setparam :  "+ex.getMessage());
		}
	}
	
	public void SetSingleDP() {
			try {
		WebElement collapse = driver.findElement(AssetMenuLocator.section);
		collapse.click();
		System.out.println("coll/exp");
		Actions.Wait(5);
		
		WebElement setdp = driver.findElement(AssetMenuLocator.setDP);
		setdp.click();
		Actions.Wait(6);
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		for(WebElement ele:list.subList( 3, 4 )){
		   String className = ele.getAttribute("class");
		   System.out.println(className);
		  Assert.assertEquals(className, "ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse", "pass");
		}
		Actions.Wait(5);
		
		}catch(Exception ex)	{
			System.out.println("Ex: setparam :  "+ex.getMessage());
		}
	} 
	
	public void ClickApply() {
		try {
		WebElement apply = driver.findElement(AssetMenuLocator.Apply);
		apply.click();
		Thread.sleep(6000);
		//Actions.Wait(10);
		WebElement paramdiv = driver.findElement(AssetMenuLocator.SetParam);
		String divclassname = paramdiv.getAttribute("class");
		assertEquals(divclassname, "collapse");
		}catch(Exception ex)	{
			System.out.println("Ex: ApplyParam:  "+ex.getMessage());
		}
	}

	public void SelectAllDPs() {
		// TODO Auto-generated method stub
		try {
	WebElement setParameters = driver.findElement(AssetMenuLocator.setimg);
	setParameters.click();
//	Actions.Wait(6);
	Thread.sleep(6000);
	System.out.println("Select all parameteres ");
	WebElement setAll = driver.findElement(AssetMenuLocator.setAll);
	setAll.click();
	Thread.sleep(6000);
	//Actions.Wait(6);
	
	
	List<WebElement> list = driver.findElements(AssetMenuLocator.inputs);

	for(WebElement ele:list.subList(3, list.size())){
	   String className = ele.getAttribute("class");
	   System.out.println(className);
	  Assert.assertEquals(className, "ng-pristine ng-untouched ng-valid ng-not-empty", "pass");
	}
	WebElement apply = driver.findElement(AssetMenuLocator.Apply);
	apply.click();
	//Actions.Wait(6);
	Thread.sleep(6000);
	WebElement paramdiv = driver.findElement(AssetMenuLocator.SetParam);
	String divclassname = paramdiv.getAttribute("class");
	Assert.assertEquals(divclassname, "collapse");
	//Actions.Wait(3);
	Thread.sleep(6000);
	
	}catch(Exception ex)	{
		System.out.println("Ex: SetAllparameters :  "+ex.getMessage());
	}
	} 
}

