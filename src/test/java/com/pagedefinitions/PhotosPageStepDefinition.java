package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.DashboardPage;
import com.pageobjects.PhotosPage;

import cucumber.api.java.en.And;

public class PhotosPageStepDefinition {

	PhotosPage photospage;
	TestContext testContext;

	public PhotosPageStepDefinition(TestContext context) {

		testContext = context;
		photospage = testContext.getPageObjectManager().getPhotosPage();

	}
	
	@And("^Upload Photo$")
	public void addToListing() {

		photospage.clickOnNewPhoto();
		photospage.clickOnCameraButton();
		photospage.selectPhoto();
		photospage.clickOnNextButton();
	}
	
}
