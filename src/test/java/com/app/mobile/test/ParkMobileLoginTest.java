package com.app.mobile.test;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.app.test.baseclasses.CopyOfMobileTestBase;
import com.iambank.pages.SampleScreens.ParkMobileLoginPage;

public class ParkMobileLoginTest {
	public static AndroidDriver driver;
	String appiumServiceUrl = "http://127.0.0.1:4723/wd/hub";
	 String baseUrl="http://selfserviceportal-test.parkmobile.3pillarglobal.com";
	@Test
	public void startServer() throws Exception {	
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME,"Browser");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("VERSION", "6.0");
		
		WebDriver driver = new AndroidDriver (new URL(appiumServiceUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); 
		Thread.sleep(2000);
		driver.get(baseUrl);
		Thread.sleep(4000);
		ParkMobileLoginPage loginpage = new ParkMobileLoginPage(driver);
		loginpage.enterUsernamePswd("peach@test.com","Tpg@12345");
		
		
	}

}
