package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.DashboardPage;

import cucumber.api.java.en.And;

public class DashboardPageStepDefinition {

	DashboardPage dashboardpage;
	TestContext testContext;

	public DashboardPageStepDefinition(TestContext context) {
		testContext = context;
		dashboardpage = testContext.getPageObjectManager().getDashboardPage();

	}

	@And("^Click on Sell button$")
	public void clickOnSell() {

		dashboardpage.clickOnSellButton();

	}

	@And("^Click on See All$")
	public void clickOnSeeAll() {

		dashboardpage.clickOnSellAll();

	}

}
