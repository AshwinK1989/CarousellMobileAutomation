package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class DashboardPage {

	WebDriver driver;
	public String btnSell   = "//android.widget.Button[contains(@resource-id,'button_sell')]";
	public String btnSeeAll = "//android.widget.LinearLayout[contains(@resource-id,'home_page_see_all_button')]";
	
	public DashboardPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void clickOnSellButton()  {
		
		GenericMethods.click(driver, btnSell);
	}
	
	public void clickOnSellAll () {
		
		GenericMethods.click(driver, btnSeeAll);
	}
		
	
}
