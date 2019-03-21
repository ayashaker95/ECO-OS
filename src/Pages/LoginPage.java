package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import Locator.locator;
public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@Parameters({"UserName","Password"})
	public void loginToSite (String UserName, String Password) {
		WebDriverWait wait = new WebDriverWait(driver, 100);

	try {	
			WebElement email = driver.findElement(By.id("Username"));
			email.sendKeys(UserName);
			Thread.sleep(500);
			WebElement password = driver.findElement(By.id("Password"));
			password.sendKeys(Password);
			Thread.sleep(500);
			WebElement Loginbtn = driver.findElement(By.xpath(Locator.locator.LoginBtn));
			Loginbtn.click();
			
			Thread.sleep(7000);
			
					
	}catch(Exception e)	{
		
	}
			
	
		
	}
	


}
