package com.ecoos.pages;

import static org.testng.Assert.assertEquals;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import com.ecoos.locator.AssetMenuLocator;
import com.ecoos.utilities.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
	    Thread.sleep(300);
		}catch(Exception ex)	{
			System.out.println("Ex: setparam :  "+ex.getMessage());
		}
	}
	
	public void SetSingleDP() {
			try {
		WebElement collapse = driver.findElement(AssetMenuLocator.section1);
		collapse.click();
		System.out.println("coll/exp");
		Thread.sleep(500);
		
		WebElement setdp = driver.findElement(AssetMenuLocator.setDP);
		setdp.click();
		Thread.sleep(500);
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		for(WebElement ele:list.subList( 3, 4 )){
		   String className = ele.getAttribute("class");
		   System.out.println(className);
		  Assert.assertEquals(className, "ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse", "pass");
		}
		Thread.sleep(500);
		
		}catch(Exception ex)	{
			System.out.println("Ex: setparam :  "+ex.getMessage());
		}
	} 
	
	public void ClickApply() {
		try {
		WebElement apply = driver.findElement(AssetMenuLocator.Apply);
		apply.click();
		Thread.sleep(6000);
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
/*	WebElement setParameters = driver.findElement(AssetMenuLocator.setimg);
	setParameters.click();
	Thread.sleep(6000);*/
	SetParam();
	System.out.println("Select all parameteres ");
	WebElement setAll = driver.findElement(AssetMenuLocator.setAll);
	setAll.click();
	Thread.sleep(6000);
	List<WebElement> list = driver.findElements(AssetMenuLocator.inputs);
	for(WebElement ele:list.subList(3, list.size())){
	   String className = ele.getAttribute("class");
	  Assert.assertEquals(className, "ng-pristine ng-untouched ng-valid ng-not-empty", "pass");
	}
	Thread.sleep(500);
	// after click apply 
	/*WebElement paramdiv = driver.findElement(AssetMenuLocator.SetParam);
	String divclassname = paramdiv.getAttribute("class");
	Assert.assertEquals(divclassname, "collapse");
	Thread.sleep(6000);*/
	
	}catch(Exception ex)	{
		System.out.println("Ex: SetAllparameters :  "+ex.getMessage());
	}
		
	} 
	
	public void OpenSection() {
		try {
			System.out.println("Open section");
			WebElement section = driver.findElement(AssetMenuLocator.section2);
			section.click();
			Thread.sleep(1000);
		}catch(Exception ex)	{
			System.out.println("Ex: opensection:  "+ex.getMessage());
		}
	}
	public void Convert() {
		try {
			Thread.sleep(2000);
			//WebElement slider = driver.findElement(By.xpath("/html/body/section/section/section/section[1]/div[3]/div[3]/set-parameters/div[2]/div[3]/div"));
			/*WebElement maindiv = driver.findElement(By.xpath("//div[@class='row set-params-container']/uib-accordion/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/label/input"));
			String classname = maindiv.getAttribute("class");
			System.out.println(classname);*/
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row set-params-container']/uib-accordion/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/label/input")));
			driver.findElement(By.xpath("//div[@class='row set-params-container']/uib-accordion/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/label/input")).click();
			
		}catch(Exception ex)	{
			System.out.println("Ex: Convert:  "+ex.getMessage());
		}
	}



}

