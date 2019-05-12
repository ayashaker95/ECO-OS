package com.ecoos.tests;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.ecoos.base.BaseTest;
import com.ecoos.pages.AssetMenu;;


public class AssetMenuTest extends BaseTest {
	
	@Test
	public void ChooseAsset(){
	AssetMenu Menu = new AssetMenu(driver);
	Menu.Choose_asset();
	}
	
	@Test
	public void SetParameters(){
	AssetMenu Menu = new AssetMenu(driver);
	Menu.SetParam();
	
	}
	@Test
	public void SetSingleDp(){
	AssetMenu Menu = new AssetMenu(driver);
	Menu.SetSingleDP();;
	
	}
	@Test
	public void clickapply(){
	AssetMenu Menu = new AssetMenu(driver);
	Menu.ClickApply();
	}
	
	@Test
	public void SelectAllDPs(){
	AssetMenu Menu = new AssetMenu(driver);
	Menu.SelectAllDPs();
	}
}
