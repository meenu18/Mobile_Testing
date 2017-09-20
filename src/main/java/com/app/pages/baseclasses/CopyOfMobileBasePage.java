package com.app.pages.baseclasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CopyOfMobileBasePage {
protected static WebDriver driver;
	
	protected CopyOfMobileBasePage(WebDriver driver) {
		this.driver = driver; 
		this.getClass().getSimpleName();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
