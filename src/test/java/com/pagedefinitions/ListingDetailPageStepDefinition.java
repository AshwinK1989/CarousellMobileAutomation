package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.IntroPage;
import com.pageobjects.ListingDetailPage;

import cucumber.api.java.en.And;

public class ListingDetailPageStepDefinition {

	ListingDetailPage listingpage;
	TestContext testContext;

	public ListingDetailPageStepDefinition(TestContext context) {

		testContext = context;
		listingpage = testContext.getPageObjectManager().getListingDetailPage();
	}

	@And("^List the product$")
	public void selectCategory() {

		listingpage.enterTitle();
		listingpage.enterPrice();
		listingpage.clickOnListIt();
		listingpage.clickOnClose();
		listingpage.clickOnBrowseTab();
	}

}
