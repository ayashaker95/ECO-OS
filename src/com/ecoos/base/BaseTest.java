package com.ecoos.base;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ecoos.utilities.PropertyManager;


public class BaseTest {
	public static WebDriver driver;

  @BeforeSuite
  public void beforeSuite(){
	  try {
 
	  	ChromeOptions options = new ChromeOptions();
		List<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");
		options.addArguments(arguments);
		String url = PropertyManager.getInstance().getURL();
		String driverPath = PropertyManager.getInstance().getdriverPath();
		System.out.println(url);
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver(options);
		driver.get(url); 	

	  }catch(Exception e)	{
			System.out.println("Ex: Base :  "+e.getMessage());
			
		}
		  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Test is finished");
	// driver.quit();
  }
}
