package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.ChooseCategoryPage;

import cucumber.api.java.en.And;

public class ChooseCategoryPageStepDefinition {

	ChooseCategoryPage choosecategorypage;
	TestContext testContext;

	public ChooseCategoryPageStepDefinition(TestContext context) {

		testContext = context;
		choosecategorypage = testContext.getPageObjectManager().getChooseCategoryPage();

	}

	@And("^Select the Category$")
	public void selectCategory() {

		choosecategorypage.searchCategory();
		choosecategorypage.selectCategory();
	}
}
