package com.ecoos.tests;

import org.testng.annotations.Test;

import com.ecoos.base.BaseTest;
import com.ecoos.pages.CollectOperation;;

public class CollectOperationTest extends BaseTest{
	
	
	@Test
	public void CheckDP(){
	CollectOperation opertaion = new CollectOperation(driver);
	opertaion.scrollDown();
	opertaion.CheckDP();
	}

}
