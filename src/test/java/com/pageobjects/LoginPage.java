package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class LoginPage {

	WebDriver driver;
	public String txtEmail    = "//android.widget.EditText[@index='0']";
	public String txtPassword = "(//android.widget.EditText[@index='0'])[2]";
	public String btnLogIn    = "//android.widget.Button[contains(@resource-id,'login_button')]";

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginIntoApp ()  {
		
		GenericMethods.input(driver, txtEmail, "ashu271989@gmail.com");
		GenericMethods.input(driver, txtPassword, "test@123");
		GenericMethods.click(driver, btnLogIn);

	}
	
  
}
