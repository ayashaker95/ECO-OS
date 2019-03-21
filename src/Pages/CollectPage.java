package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Locator.locator;
public class CollectPage {
	
	WebDriver driver;

	public CollectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void MainPage() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		try {	
			//filter by protocol
			System.out.println(Locator.locator.years);
			
			WebElement  protcoldropdown = driver.findElement(By.xpath(Locator.locator.protcoldropdown));
			Select Promenu = new Select(protcoldropdown);
			Promenu.selectByVisibleText("Israel Pollutant Release and Transfer Register (PRTR)");
			Thread.sleep(6000);
			//filter by year
			WebElement  years = driver.findElement(By.xpath(Locator.locator.years));
			Select yearsmenu= new Select(years);
			yearsmenu.selectByVisibleText("2015");
			Thread.sleep(6000);
			// open any category like Energy (related to protocol and site )
			WebElement category = driver.findElement(By.xpath(Locator.locator.category));
			category.click();	
			Thread.sleep(5000);
			WebElement arrows = driver.findElement(By.xpath(Locator.locator.arrows));
			String classname = arrows.getAttribute("Class");
			if (classname != "fa fa-angle-double-up") {
				arrows.click();
			}
			WebElement SelectAssetBtn = driver.findElement(By.xpath(Locator.locator.SelectAsssetbtn));
			SelectAssetBtn.click();
			System.out.println(classname);
			
			
			
			
			
	}catch(Exception e)	{
		
	}
	}

}

