package com.app.test.baseclasses;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.app.pages.baseclasses.MobileBasePage;
import com.iambank.pages.SampleScreens.BasePage;

public class MobileTestBase {


	public static AndroidDriver driver;
	String appiumServiceUrl = "http://127.0.0.1:4723/wd/hub";
	String apkPath="/Apps/IAmBanking/";
	@BeforeSuite(alwaysRun=true)
	public void startServer() throws Exception {
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723 --session-override -dc \"{\"\"noReset\"\": \"\"false\"\"}\"\"");
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, apkPath);
		File app = new File(appDir, "IamBank-debug.apk");
		//String appiumServiceUrl = appiumService.getUrl().toString();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME","");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("VERSION", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath()); 
		/*capabilities.setCapability("appPackage", "com.iambank.debug");
		capabilities.setCapability("appActivity", "com.iambank.onboarding.ui.activity.IntroActivity");*/
		
		driver = new AndroidDriver(new URL(appiumServiceUrl), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); 
		Thread.sleep(10000);
		
	
	}
	
	@AfterSuite(alwaysRun=true)
	public void appiumStop() throws Exception {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
			runtime.exec("taskkill /F /IM cmd.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}

