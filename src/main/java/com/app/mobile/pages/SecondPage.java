package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SecondPage {
	public AndroidDriver driver;
	private WebElement skipBtn=driver.findElement(By.xpath("//android.widget.TextView[@text='Skip this stuff']"));

	
	public SecondPage(AndroidDriver driver) {
		super();
	}


	public CountryPage clickSkipBtn(){
		
		skipBtn.click();
		return new CountryPage(driver);
	}

}
