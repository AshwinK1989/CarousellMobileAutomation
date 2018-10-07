package com.setup;

import java.io.File;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class WebDriverFactory {

	static AndroidDriver create(String platform, String deviceName, String platformName, String platformVersion,
			String appPackage, String appActivity, String sPlatformAppPath, String sPlatformIpAddress, String deviceId,
			String port) throws IllegalAccessException {
		try {
			AndroidDriver<WebElement> driver;
			switch (platform) {
			case "Device":
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("deviceName", deviceName);
				capabilities.setCapability("platformName", platformName);
				capabilities.setCapability("platformVersion", platformVersion);
				capabilities.setCapability("automationName", "UiAutomator2");
				capabilities.setCapability("autoGrantPermissions", true);
				capabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.thecarousell.*");

				File f = new File(System.getProperty("user.dir") + sPlatformAppPath);
				capabilities.setCapability("app", f.getAbsolutePath());
				driver = new AndroidDriver(new URL("http://" + sPlatformIpAddress + ":" + port + "/wd/hub"),
						capabilities);

				break;

			default:
				throw new IllegalAccessException();

			}

			return driver;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;

	}
}
