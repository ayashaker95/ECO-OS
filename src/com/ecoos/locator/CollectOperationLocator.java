package com.ecoos.locator;
import org.openqa.selenium.By;

public class CollectOperationLocator {
	public static By Section = By.xpath("//div[6]/div[2]/div/div");
	public static By SubSection = By.xpath("//div[6]/div[2]/uib-accordion/div/div/div/h4/a[1]");
	public static By response = By.xpath("//div[@on='dataPoint.QuestionType']/div/div[2]/div[@ng-switch-when]");
	public static By Textarea = By.xpath("//textarea[@class='ng-pristine ng-untouched ng-valid ng-empty']");
	public static By Granularity = By.xpath("//div[@class=\"datapoint__unit ng-scope\"]/span[2]");
	public static By SaveBtn = By.xpath("//img[@alt='Save button']");
	public static By Monthlytextarea = By.xpath("//input[@id='rad_949']");
	public static By Annualtextarea = By.xpath("//input[@id='rad_1019']");
	public static By datapointResponse = By.xpath("//div[@id=\"accordiongroup-3598-4374-panel\"]/div/div/div[1]/div[2]/div/div/input");
	public static By radiolabel = By.xpath("//div[2]/div/div/div/div[2]/div/div/label[@for='rad_4_467']");
	public static By tools = By.xpath("//div[@id='accordiongroup-4635-9975-panel']/div/div/div/div[5]/span");
	public static By Ref = By.xpath("//li[4]/a/uib-tab-heading/div");
	public static By info = By.xpath("//li[5]/a/uib-tab-heading/div");
	public static By sectionToScroll = By.xpath("\"/html/body/section/section/section/section[1]/div[3]/div[6]/div[2]/uib-accordion[2]/div/div[1]\"");
}
