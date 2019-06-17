package com.ecoos.tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.ecoos.base.BaseTest;
import com.ecoos.locator.SelectAssetLocator;
import com.ecoos.pages.SelectAsset;
import com.ecoos.utilities.Actions;
import com.ecoos.utilities.Constants;

public class SelectAssetsTest extends BaseTest {

	@Test
	public void AssetMenuControl() {
		SelectAsset asset = new SelectAsset();
		asset.assetControl();
	}

	@Test
	public void SelectAll() {
		SelectAsset asset = new SelectAsset();
		asset.SelectAll(SelectAssetLocator.SelectAll);
	}

	@Test
	public void SelectChild() {
		SelectAsset asset = new SelectAsset();
		asset.SelectChildasset(SelectAssetLocator.Childasset);
	}

	@Test
	public void SelectSecondChild() {
		SelectAsset asset = new SelectAsset();
		asset.SelectSecondasset(SelectAssetLocator.Secondasset);
	}

	@Test
	public void ClickApplyBtn() {
		SelectAsset asset = new SelectAsset();
		asset.ClickApplyBtn(SelectAssetLocator.ApplyButton);
		Assert.assertEquals(Actions.getCurrentURL(), Constants.eng_category);
	}
}
