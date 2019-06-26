package com.ecoos.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.ecoos.base.BaseTest;
import com.ecoos.locator.HomePageLocator;
import com.ecoos.pages.HomePage;
import com.ecoos.utilities.Constants;
import static com.ecoos.utilities.ReadWriteExcelFile.getExcelDataWithoutHeader;

import java.io.IOException;

public class HomePageTest extends BaseTest {
	
	
	@Test
	@Parameters({ "Review", "Analyze", "Report", "Collect" })
	public void NavigateMenuTabs(String tabName) throws InterruptedException {
		HomePage navigate = new HomePage();
		navigate.switchMainTabs((navigate.gereateCategoryXpath(tabName)));
		Assert.assertEquals(navigate.getCurrentURL(), Constants.Review);
	}

	@Test
	public void ProctcolTest() {
		HomePage collect = new HomePage();
		collect.seletcProctol(HomePageLocator.protcoldropdown, Constants.ProtocolName);
		String text = collect.getElementText(HomePageLocator.protcoldropdown);
		if (text.contains(Constants.ProtocolName))
			Assert.assertTrue(true);
	}

	@Test
	public void YearsTest() {
		HomePage collect = new HomePage();
		collect.seletcYear(HomePageLocator.yearsdropdown, Constants.Year);
		String text = collect.getElementText(HomePageLocator.yearsdropdown);
		if (text.contains(Constants.Year))
			Assert.assertTrue(true);
	}

	@Test(dataProvider = "ValidDataProvider1")
	public void OpenCategory(String categoryName) {
		HomePage collect = new HomePage();
		collect.OpenCategory((collect.gereateCategoryXpath(categoryName)));
		Assert.assertEquals(collect.getCurrentURL(), Constants.Eng_category);
	}

	@DataProvider
	public Object[][] ValidDataProvider1() throws IOException {

		return getExcelDataWithoutHeader("Categories-names.xls", "Sheet1");
	}
}
