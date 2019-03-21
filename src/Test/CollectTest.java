package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Core.BaseTest;
import Locator.locator;
import Pages.LoginPage;
import Pages.CollectPage;

public class CollectTest extends BaseTest {
	
	
	@Test 
	public void CollectTest () {
		
		CollectPage collect = new CollectPage(driver);
		collect.MainPage();
	}

}
