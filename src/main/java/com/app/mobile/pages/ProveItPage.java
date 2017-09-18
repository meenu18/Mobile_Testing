package com.app.mobile.pages;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProveItPage {	
	public AndroidDriver driver;
	
	public FirstPage clickOnProveBtn(AndroidDriver driver){	
		WebElement proveItBtn= driver.findElement(By.xpath("//android.widget.Button[@text='Ok, so prove it!']"));
		proveItBtn.click();
		return new FirstPage(driver);
	}
	public String getProveItPageText(){	
		 WebElement proveItPageText= driver.findElement(By.className("android.widget.ImageView"));		
		return proveItPageText.getText();		
	}
	public boolean verifyProveItPageText(){
		String expectedText = "iambank";
		return getProveItPageText().contains(expectedText);
		}

}
