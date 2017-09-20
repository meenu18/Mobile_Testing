package com.iambank.pages.SampleScreens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebElement;

import com.app.pages.baseclasses.MobileBasePage;

public  class IntroductoryPage extends MobileBasePage {	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Ok, so prove it!']")
	private WebElement proveItBtn;
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'chance')]")
	private WebElement proveItPageText;
	
	public IntroductoryPage(AndroidDriver driver) {
		super(driver);		
	}
	public FirstPage clickOnProveBtn() {	
		proveItBtn.click();
		return new FirstPage(driver);
		
	}
	public String getProveItPageText() {	
		return proveItPageText.getText();		
	}
	
	public boolean verifyProveItPageText(String expectedIntroText) {
		return getProveItPageText().contains(expectedIntroText);
		}

}