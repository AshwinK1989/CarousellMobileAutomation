package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class ChooseCategoryPage {

	WebDriver driver;
	public String txtSearchCategory = "//android.widget.EditText[contains(@resource-id,'search_field')]";
	public String listCategoryEE    = "//android.widget.TextView[@text='Everything Else']";

	public ChooseCategoryPage(WebDriver driver) {

		this.driver = driver;
	}

	public void searchCategory() {

		GenericMethods.input(driver, txtSearchCategory, "Everything Else");
	}
	
	public void selectCategory() {
		
		GenericMethods.click(driver, listCategoryEE);
	}
}
