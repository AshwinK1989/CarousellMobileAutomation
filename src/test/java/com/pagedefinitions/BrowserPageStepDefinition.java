package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.BrowsePage;

import cucumber.api.java.en.And;

public class BrowserPageStepDefinition {

	BrowsePage browsePage;
	TestContext testContext;

	public BrowserPageStepDefinition(TestContext context) {

		testContext = context;
		browsePage = testContext.getPageObjectManager().getBrowsePage();

	}
	
	
	@And("^filter the product$")
	public void filterTheProduct() {

		browsePage.clickOnEverythingElse();

	}
}
