package com.ecoos.locator;

import org.openqa.selenium.By;

public class CollectLocator {
	
	public static By collect = By.xpath("//a[@ui-sref='dashboard.collect']");
	public static By review = By.xpath("//a[@ui-sref='dashboard.review']");
	public static By analyze = By.xpath("//a[@ui-sref='dashboard.analyze']");
	public static By report=  By.xpath("//a[@ui-sref='dashboard.report-protocol']");
	public static By protcoldropdown = By.xpath("//select[@ng-model='hdr.selectedProtocolId']");
	public static By yearsdropdown = By.xpath("//select[@ng-model='hdr.selectedYear']");
	public static By Eng_category = By.xpath("//div[@href='/new-collect/3']");
	public static By assetToolsCollapse = By.xpath("//i[@ng-click='assetToolsCollapse = !assetToolsCollapse']");
	public static By SelectAssetsButton = By.xpath("//button[@href='/new-select-asset/3']");
	
}
