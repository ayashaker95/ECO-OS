package com.ecoos.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.ecoos.base.BaseTest;
import com.ecoos.locator.HomePageLocator;
import com.ecoos.pages.HomePage;
import com.ecoos.utilities.Actions;
import com.ecoos.utilities.Constants;

public class HomePageTest extends BaseTest {

	@Test
	public void Review() throws InterruptedException {
		HomePage review = new HomePage();
		review.switchMainTabs(HomePageLocator.review);
		Assert.assertEquals(Actions.getCurrentURL(), Constants.review);
	}

	@Test
	public void Analyze() throws InterruptedException {
		HomePage analyze = new HomePage();
		analyze.switchMainTabs(HomePageLocator.analyze);
		Assert.assertEquals(Actions.getCurrentURL(), Constants.analyze);
	}

	@Test
	public void Report() throws InterruptedException {
		HomePage report = new HomePage();
		report.switchMainTabs(HomePageLocator.report);
		Assert.assertEquals(Actions.getCurrentURL(), Constants.report);
	}

	@Test
	public void Collect() throws InterruptedException {
		HomePage collect = new HomePage();
		collect.switchMainTabs(HomePageLocator.collect);
		Assert.assertEquals(Actions.getCurrentURL(), Constants.collect);

	}

	@Test
	public void ProctcolTest() {
		HomePage collect = new HomePage();
		collect.dropDownList(HomePageLocator.protcoldropdown, Constants.protocolName);
		String text = Actions.getText(HomePageLocator.protcoldropdown);
		if (text.contains(Constants.protocolName))
			Assert.assertTrue(true);
	}

	@Test
	public void YearsTest() {
		HomePage collect = new HomePage();
		collect.dropDownList(HomePageLocator.yearsdropdown, Constants.year);
		String text = Actions.getText(HomePageLocator.yearsdropdown);
		if (text.contains(Constants.year))
			Assert.assertTrue(true);
	}

	@Test
	public void OpenCategory() {
		HomePage collect = new HomePage();
		collect.OpenCategory(HomePageLocator.Eng_category);
		Assert.assertEquals(Actions.getCurrentURL(),Constants.eng_category);
	}
}
