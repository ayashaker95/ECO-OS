package com.ecoos.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.ecoos.locator.CollectOperationLocator;
import com.ecoos.utilities.Actions;


public class CollectOperation {
	WebDriver driver;
	
	
	public CollectOperation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	public void CheckDP() {
		try {
		System.out.println("Check DP");
		Thread.sleep(1000);
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
		Actions.Wait(5);
		save();
		Actions.Wait(5);
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
			driver.findElement(CollectOperationLocator.Monthlytextarea).click();
		}else if (Granularity == "Annual") {
			driver.findElement(CollectOperationLocator.Annualtextarea).sendKeys("10");
			Actions.Wait(6);
			save();
			Actions.Wait(6);
		}
	   }catch(Exception ex)	{
		System.out.println("Ex: NumericDP :  "+ex.getMessage());
	  }		
	}
    public void save() {
    	Actions.click(CollectOperationLocator.SaveBtn);
	}
   
}
