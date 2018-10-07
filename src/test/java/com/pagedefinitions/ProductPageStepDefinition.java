package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.ProductPage;

import cucumber.api.java.en.And;
import junit.framework.Assert;

public class ProductPageStepDefinition {
	
	ProductPage productpage;
	TestContext testContext;

	public ProductPageStepDefinition(TestContext context) {
		
		testContext = context;
		productpage = testContext.getPageObjectManager().getProductPage();

	}
	
	@And("^Click on popup button$")
	public void clickOnPopup() {

		productpage.clickOnOkGotit();
	}
	
	@And("^Select Recent filter$")
	public void selectRecentFilter() {

		productpage.selectRecentFilter();
	}
	
	@And("^Scroll to listed Product$")
	public void scrollToListedProduct() {

		productpage.scrollToListedProduct();
	}
	
	@And("^Verify whether the product is present$")
	public void verifyProductPresent() {

		Assert.assertEquals("Divine", productpage.getProductText());
	}
	
	

}
