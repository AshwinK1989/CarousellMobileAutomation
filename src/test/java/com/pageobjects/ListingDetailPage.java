package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class ListingDetailPage {

	WebDriver driver;
	public String txtListingTitle = "//android.widget.EditText[@index=0]";
	public String txtPrice        = "//android.widget.EditText[contains(@resource-id,'text_input')]";
	public String btnListit       = "//android.widget.FrameLayout[contains(@resource-id,'button_submit')]";
	public String btnClose        = "//android.widget.ImageView[contains(@resource-id,'btn_close')]";
	public String tabBrowse       = "//android.widget.TextView[@text='BROWSE']";

	public ListingDetailPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterTitle()  {
		
		GenericMethods.input(driver, txtListingTitle, "Divine");
	}
	
	public void enterPrice ()  {
		
		GenericMethods.input(driver, txtPrice, "4");
	}
	
	public void clickOnListIt () {
		
		GenericMethods.click(driver, btnListit);
	}
	
     public void clickOnClose () {
		
		GenericMethods.click(driver, btnClose);
	}
     
     public void clickOnBrowseTab () {
 		
 		GenericMethods.click(driver, tabBrowse);
 	}
}
