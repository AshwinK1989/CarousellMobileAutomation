package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class PhotosPage {

	WebDriver driver;
	public String btnNewPhoto = "//android.widget.FrameLayout[contains(@resource-id,'view_open_camera')]";
	public String btnCamera   = "//android.widget.ImageButton[contains(@resource-id,'fab_capture')]";
	public String tnPhoto     = "//android.widget.FrameLayout[@content-desc='image_selection_page_photo_1']";
	public String btnNext     = "//android.widget.TextView[contains(@resource-id,'action_done')]";

	public PhotosPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clickOnNewPhoto() {

		GenericMethods.click(driver, btnNewPhoto);
	}

	public void clickOnCameraButton() {

		GenericMethods.click(driver, btnCamera);
	}
	
	public void selectPhoto() {
		
		GenericMethods.click(driver, tnPhoto);
	}
	
	public void clickOnNextButton() {
		
		GenericMethods.click(driver, btnNext);

	}

}
