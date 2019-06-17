package com.ecoos.tests;

import org.testng.annotations.Test;
import com.ecoos.base.BaseTest;
import com.ecoos.locator.CollectOperationLocator;
import com.ecoos.pages.CollectOperation;;

public class CollectOperationTest extends BaseTest{
	
	
	@Test
	public void scrollDown(){
	CollectOperation opertaion = new CollectOperation();
	opertaion.scrollDown(CollectOperationLocator.sectionToScroll);
	}
	
	@Test
	public void CheckDP(){
	CollectOperation opertaion = new CollectOperation();
	opertaion.CheckDP(CollectOperationLocator.datapointResponse);
	}
	/*@Test
	public void Answer(){
	CollectOperation opertaion = new CollectOperation(driver);
	opertaion.Answer();
	}
	@Test
	public void Tools(){
	CollectOperation opertaion = new CollectOperation(driver);
	opertaion.openTools();
	}*/
}
