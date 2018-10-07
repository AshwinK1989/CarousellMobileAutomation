package com.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;


public class GenericMethods {

	public static void click(WebDriver driver, String sLocator) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).click();
	}

	public static void input(WebDriver driver, String sLocator, String inputValue) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).clear();
		driver.findElement(By.xpath(sLocator)).sendKeys(inputValue);
	}

	public static WebElement getElement(WebDriver driver, String sLocators) {

		try {
			waitMethod(driver, sLocators);
			return driver.findElement(By.xpath(sLocators));
		} catch (Exception e) {

			e.getMessage();
		}

		return null;
	}

	public static void waitMethod(WebDriver driver, String sLocators) {

		WebDriverWait wait = new WebDriverWait(driver, 120);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

	}

	public static void waitToClickMethod(WebDriver driver, String sLocators) {

		WebDriverWait wait = new WebDriverWait(driver, 260);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sLocators)));

	}

	public static void scroll(WebDriver driver, String text) {

		((AndroidDriver) driver).findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"))");

	}


}
