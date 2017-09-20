package com.app.pages.baseclasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

public class MobileBasePage {
protected static AndroidDriver driver;
	
	protected MobileBasePage(AndroidDriver driver) {
		this.driver = driver; 
		this.getClass().getSimpleName();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
