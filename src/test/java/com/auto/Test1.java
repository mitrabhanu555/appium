package com.auto;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


public class Test1 {

	public static void main(String[] args) throws Throwable {
		
     URL url = new URL("http://localhost:4723/wd/hub");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("deviceName", "8c48cec3");
	capabilities.setCapability("browserName", "chrome");
	AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(url, capabilities);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://in.linkedin.com/");
	Thread.sleep(3000);
	driver.quit();
		
		

	}

}
