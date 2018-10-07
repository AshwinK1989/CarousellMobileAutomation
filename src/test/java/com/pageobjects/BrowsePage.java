package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class BrowsePage {

	WebDriver driver;
	
	public String catEE = "//android.widget.TextView[@text='EVERYTHING ELSE']";
	
	public BrowsePage(WebDriver driver) {

		this.driver = driver;
	}
	
	
	public void clickOnEverythingElse () {
		
		
		GenericMethods.scroll(driver, "EVERYTHING ELSE");
		GenericMethods.click(driver, catEE);
	}
}
