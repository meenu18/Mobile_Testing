package com.app.mobile.test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.mobile.pages.FirstPage;
import com.app.mobile.pages.ProveItPage;
import com.app.mobile.pages.SecondPage;

public class StartApplication {

	private static AndroidDriver driver;
	ProveItPage proveItPage = new ProveItPage();
	FirstPage firstPage;
	SecondPage secondPage;
	
	@Test
	public void launchApp() throws MalformedURLException, Exception{
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/IAmBanking/");
		File app = new File(appDir, "IamBank-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		//capabilities.setCapability("BROWSER_NAME","");
		capabilities.setCapability("deviceName", "Nexus_6_API_23");
		capabilities.setCapability("VERSION", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		//capabilities.setCapability("appPackage", "com.iambank.debug");
		//capabilities.setCapability("appActivity", "com.iambank.onboarding.ui.activity.IntroActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//driver.quit();
		//Assert.assertTrue(proveItPage.verifyProveItPageText());
		firstPage=proveItPage.clickOnProveBtn(driver);		
		Thread.sleep(3000);
		//Assert.assertTrue("Text are same", firstPage.verifyFirstPage());
		secondPage = firstPage.clickOnStraightFwdBtn();
		Thread.sleep(3000);
		secondPage.clickSkipBtn();
}
	
	

}
