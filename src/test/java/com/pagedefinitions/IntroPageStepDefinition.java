package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.IntroPage;

import cucumber.api.java.en.And;

public class IntroPageStepDefinition {

	IntroPage introPage;
	TestContext testContext;

	public IntroPageStepDefinition(TestContext context) {
		testContext = context;
		introPage = testContext.getPageObjectManager().getIntroPage();

	}

	@And("^Clicked on Login Button$")
	public void loginIntoApplication() {

		introPage.clickOnLogIn();
	}

	
}
