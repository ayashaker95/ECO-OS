package com.ecoos.locator;
import org.openqa.selenium.By;

public class CollectOperationLocator {
	public static By Section = By.xpath("/html/body/section/section/section/section[1]/div[3]/div[6]/div[2]/uib-accordion[2]/div/div[1]");
	public static By SubSection = By.xpath("//div[@class='flex-row datapoint']");
	public static By response = By.xpath("//div[@on='dataPoint.QuestionType']/div/div[2]/div[@ng-switch-when]");
	public static By Textarea = By.xpath("//textarea[@class='ng-pristine ng-untouched ng-valid ng-empty']");
	public static By Granularity = By.xpath("//div[@class=\"datapoint__unit ng-scope\"]/span[2]");
	public static By SaveBtn = By.xpath("//img[@alt='Save button']");
	public static By Monthlytextarea = By.xpath("//input[@id='rad_949']");
	public static By Annualtextarea = By.xpath("//input[@id='rad_1019']");
	
}
