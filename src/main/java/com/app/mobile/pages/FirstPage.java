package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class FirstPage {
	public AndroidDriver driver;	
	
	public FirstPage(AndroidDriver driver) {
		super();
	}
	public SecondPage clickOnStraightFwdBtn(){
		 WebElement straightFwdBtn=driver.findElement(By.xpath("//android.widget.Button[@text='Seems straightforward.')]"));
		straightFwdBtn.sendKeys(Keys.ENTER);
		return new SecondPage(driver);
	}
	public String getFirstPageText(){	
		WebElement firstPageText= driver.findElement(By.xpath("//android.widget.TextView[@text='1 OF 4']"));
		return firstPageText.getText();	
	}
	public boolean verifyFirstPage(){
		String expectedText = "1 OF 4";
		return getFirstPageText().contains(expectedText);
		}
	
}
