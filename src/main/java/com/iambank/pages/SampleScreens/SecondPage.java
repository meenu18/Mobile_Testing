package com.iambank.pages.SampleScreens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SecondPage extends BasePage {
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Skip')]")
	private WebElement skipBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'2 OF 4')]")
	private WebElement firstPageText;
	
	public SecondPage(AndroidDriver driver) {
		super(driver);
	}

	public CountryPage clickSkipBtn() {
		skipBtn.click();
		return new CountryPage(driver);
	}
	
	public String getSecondPageText() {	
		return firstPageText.getText();	
	}
	
	public boolean verifySecondPage(String expectedText) {		
		return getSecondPageText().contains(expectedText);
	}
	
}
