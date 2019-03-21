package Core;

import org.testng.annotations.BeforeSuite;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import Utilities.PropertyManager;


public class BaseTest {
	public static WebDriver driver;

  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
 
	  	ChromeOptions options = new ChromeOptions();
		List<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");
		options.addArguments(arguments);
		String url = PropertyManager.getInstance().getURL();
		String driverPath = PropertyManager.getInstance().getdriverPath();
		System.out.println(url);
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver(options);
		driver.get(url); 	
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Test is finished");
  }
}
