package com.ecoos.pages;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.ecoos.utilities.*;
import com.ecoos.locator.SelectAssetLocator;

public class SelectAsset {

	WebDriver driver;
	
	public SelectAsset(WebDriver driver) {
		this.driver = driver;
	}

	public void SelectAll () {
		try {
			
		//Select All
			System.out.println("All");
		    WebElement SelectAll = driver.findElement(SelectAssetLocator.SelectAll);
			SelectAll.click(); 
			Actions.Wait(10);
			List<WebElement> list = driver.findElements(By.tagName("input"));
			for(WebElement ele:list.subList( 2, list.size() )){
			   String className = ele.getAttribute("class");
			   System.out.println(className);
			  Assert.assertEquals(className, "ng-pristine ng-untouched ng-valid ng-not-empty", "pass");
			}
			Actions.Wait(10);
		
		
		}catch(Exception ex)
		{
			System.out.println("Ex:  :  "+ex.getMessage());
	}
	}
	
	public void Selectasset() {
		
		try {
	//	Select child asset 
			
			System.out.println("Child");
			WebElement SelectAll = driver.findElement(SelectAssetLocator.SelectAll);
			SelectAll.click();
			Actions.Wait(5);
			WebElement childasset = driver.findElement(SelectAssetLocator.Childasset);
		    childasset.click();
		    Actions.Wait(5);
		    
		   List<WebElement> parentasset = driver.findElements(By.tagName("input"));
	    for(WebElement parent : parentasset.subList(3, 4)) {
		     String className = parent.getAttribute("class");
		     System.out.println(className);
		     Assert.assertEquals(className, "ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse");
		    }
	

			
		}catch(Exception ex)	{
			System.out.println("Ex:  :  "+ex.getMessage());
		}
		}
	
	public void SelectSecondasset() {
				try {
		//	Select second child asset 
			System.out.println("second");
			WebElement casset = driver.findElement(SelectAssetLocator.Childasset);
			casset.click();
			Actions.Wait(5);
			
			WebElement passet = driver.findElement(SelectAssetLocator.Parentasset);
			passet.click();
			Actions.Wait(5);
			
			WebElement Secondasset = driver.findElement(SelectAssetLocator.Secondasset);
			Secondasset.click();
			Actions.Wait(5);
		    
		   List<WebElement> childasset = driver.findElements(By.tagName("input"));
		    for(WebElement child : childasset.subList(3,5) ){
		     String className = child.getAttribute("class");
		     System.out.println(className);
		     if (className == "ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched") {
		     Assert.assertEquals(className, "ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched");
		     }
		     else if (className == "ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse") {
		    	 Assert.assertEquals(className, "ng-untouched ng-valid ng-not-empty ng-dirty ng-valid-parse");
		     }
		     }
		}catch(Exception ex)	{
			System.out.println("Ex: SelectSecondasset :  "+ex.getMessage());
		}
		}
	
	public void ClickApply()  {
		try {
		WebElement applybutton = driver.findElement(SelectAssetLocator.ApplyButton);
		applybutton.click();
		Actions.Wait(7);
		}catch(Exception ex)	{
			System.out.println("Ex: SelectSecondasset :  "+ex.getMessage());
		}
	}
}



