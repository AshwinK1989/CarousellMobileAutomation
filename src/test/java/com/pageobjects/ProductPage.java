package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class ProductPage {

	WebDriver driver;

	public String btnOkGotit        = "//android.widget.TextView[contains(@resource-id,'feature_button')]";
	public String ddSortFilter      = "//android.widget.TextView[contains(@resource-id,'bar_filter_title')]";
    public String radioRecent       = "//android.widget.RadioButton[@text='Recent']";
    public String btnFilteredResult = "//android.widget.Button[contains(@resource-id,'btn_filter')]";
    public String productText       = "//android.widget.TextView[@text='Divine' and @resource-id = 'com.thecarousell.Carousell:id/text_attribute_1']";
	
	public ProductPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void clickOnOkGotit() {
		
		GenericMethods.click(driver, btnOkGotit);
	}
	
	public void selectRecentFilter () {
		
		GenericMethods.click(driver, ddSortFilter);
		GenericMethods.click(driver, radioRecent);
		GenericMethods.click(driver, btnFilteredResult);
	}
	
	public void scrollToListedProduct () {
		
		GenericMethods.scroll(driver, "Divine");
	}
	
    public String getProductText () {
		
		return GenericMethods.getElement(driver, productText).getText();
	}
	
	
}
