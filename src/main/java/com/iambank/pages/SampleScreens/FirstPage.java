package com.iambank.pages.SampleScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FirstPage extends BasePage {
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text,'straightforward')]")
	private WebElement straightFwdBtn;
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'1 OF 4')]")
	private WebElement firstPageText;
	
protected FirstPage(AndroidDriver driver) {
		super(driver);
}
	public SecondPage clickOnStraightFwdBtn(){
		straightFwdBtn.click();
		return new SecondPage(driver);
	}
	public String getFirstPageText(){	
		return firstPageText.getText();	
	}
	public boolean verifyFirstPage(String expectedText){
		return getFirstPageText().contains(expectedText);
	}
	
}
