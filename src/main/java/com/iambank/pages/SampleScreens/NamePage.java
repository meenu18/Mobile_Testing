package com.iambank.pages.SampleScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NamePage extends BasePage {
	@AndroidFindBy(xpath="//android.widget.EditText[contains(@resource-id,'com.iambank.debug:id/legal_name')]")
	private WebElement nameTextBox;
	@AndroidFindBy(xpath="//android.widget.Button[@text='Next']")
	private WebElement nextBtn;
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.iambank.debug:id/intro_small_txt')]")
	private WebElement legalNameMsg;
	
	protected NamePage(AndroidDriver driver) {
		super(driver);
	}
	public void enterLegalName(String userName){
		nameTextBox.sendKeys(userName);
	}
	public NumberPage clickNextBtn(){
		nextBtn.click();
		return new NumberPage(driver);
	}
	public boolean verifyNamePage(String expectedLegalMsg){
		String NextBtn= legalNameMsg.getText();		
		if (NextBtn.contains(expectedLegalMsg)){
			return true;
		}else {
		
		return false;
	}}
	

}
