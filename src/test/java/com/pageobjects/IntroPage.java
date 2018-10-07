
package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class IntroPage {

	
	public static String btnLogIn = "//android.widget.Button[contains(@resource-id,'login_button')]";
	
	
	WebDriver driver;

	public IntroPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnLogIn ()  {
		
		GenericMethods.click(driver, btnLogIn);
	}
	
}
