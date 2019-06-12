package com.ecoos.locator;

import org.openqa.selenium.By;

public class AssetMenuLocator {
	
	public static By setDP = By.xpath("//label[@for='chk467']");
	public static By setimg = By.xpath("//img[@title='Set Parameters']");
	public static By Apply = By.xpath("//button[@id='BtnSaveBottom']");
	public static By SetParam = By.xpath("//div[@uib-collapse='!vm.showSetParameters'  and @class='collapse']");
	public static By section1 = By.xpath("//div[@ng-show=\"filterDp.length > 0\"]/p[text()='DIRECT CONSUMPTION']");
	public static By setAll = By.xpath("//label[@for='chkAll']");
	public static By inputs = By.xpath("//div[@class='panel-with-collapse-icon--set-params ng-scope ng-isolate-scope panel']/div[@class='panel-collapse collapse']/div[@class='panel-body']/div[@ng-repeat=\"dp in filterDp = (datapoints | filter:vm.search)\"]/div[@class='flex-row flex-space-between set-parameters-data']/div[@class='flex-row flex-align-center']/span/input[@type='checkbox']");
	public static By section2 = By.xpath("//div[@class=\"ng-scope\"]/p[text()='INDIRECT CONSUMPTION']");
	public static By Switch = By.xpath("//*[@id=\"accordiongroup-870-824-panel\"]/div/div[2]/div[2]/div[2]/label/span");	                                  

}
