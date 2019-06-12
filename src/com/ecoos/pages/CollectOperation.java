package com.ecoos.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.ecoos.locator.CollectOperationLocator;
import com.ecoos.utilities.Actions;
import org.openqa.selenium.JavascriptExecutor;


public class CollectOperation {
	WebDriver driver;
	
	
	public CollectOperation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	public static void scrollDown(WebDriver driver) {
		try {
		System.out.print("scroll");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0,500)");
        Thread.sleep(500);
	}catch(Exception ex)	{
		System.out.println("Ex: scrollDown :  "+ex.getMessage());
	}
	}
	
	public void CheckDP() {
		try {
		System.out.println("Check DP");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		System.out.println("scroll DP");
		WebElement Section = driver.findElement(CollectOperationLocator.Section);
		Section.click(); 
		List<WebElement> Subsection = driver.findElements(CollectOperationLocator.SubSection);
		int count = Subsection.size();
		System.out.println(count);
		List<WebElement> response = driver.findElements(CollectOperationLocator.response);
		for(WebElement dp : response) {
			String format = dp.getAttribute("ng-switch-when");
			System.out.println(format);
			switch (format) {
			   case "1" : System.out.println("case1") ;
			   case "2" : System.out.println("case2");
			   case "3" :System.out.println("case3");
			   case "4" : System.out.println("case4");
			   case "5" : TextDP();
			   case "6" : NumericDP();
			  
			   }
		}
	}catch(Exception ex)	{
		System.out.println("Ex: Check dP :  "+ex.getMessage());
	}
	}
	
	public void RadioDP() {
		
	}
	public void ChechBoxDP() {
		
	}
    public void SelectDP() {
		
	}
    public void MultiSelectDP() {
		
  	}
    
	public void TextDP() {
		try {
		Actions.sendKeys(CollectOperationLocator.Textarea,"Test");
		Thread.sleep(500);
		save();
		Thread.sleep(500);
		String s = driver.findElement(CollectOperationLocator.Textarea).getText();
		Assert.assertEquals(s, "Test");
		}catch(Exception ex)	{
			System.out.println("Ex: TextDP :  "+ex.getMessage());
		}
	}
	
	public void NumericDP() {
		try {
			
		String Granularity = driver.findElement(CollectOperationLocator.Granularity).getText();
		System.out.println(Granularity);
		if (Granularity == "Monthly") {
			MonthlyDP();
		}else if (Granularity == "Annual") {
			
		}
	   }catch(Exception ex)	{
		System.out.println("Ex: NumericDP :  "+ex.getMessage());
	  }		
	}
	
	public void MonthlyDP() {
		try {
		driver.findElement(CollectOperationLocator.Monthlytextarea).click();
		Thread.sleep(500);
		}catch(Exception ex)	{
			System.out.println("Ex: MonthlyDP :  "+ex.getMessage());
		  }	
	}
	
    public void AnnualDP() {
    	try {
    	driver.findElement(CollectOperationLocator.Annualtextarea).sendKeys("10");
		Thread.sleep(6000);
		save();
		Thread.sleep(6000);
    	}catch(Exception ex)	{
			System.out.println("Ex: AnnualDP :  "+ex.getMessage());
		  }
	}
    
    public void save() {
    	try {
    	Actions.click(CollectOperationLocator.SaveBtn);
	}catch(Exception ex)	{
		System.out.println("Ex: Save :  "+ex.getMessage());
	  }
    }
    
    public void convetToAnnual() {
    	
    }

   }