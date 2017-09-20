package com.iambank.pages.SampleScreens;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NumberPage extends BasePage {
	
	@AndroidFindBy(xpath="//android.widget.Spinner/android.widget.LinearLayout[@index='0']")
	private WebElement defaultFlag;
	
	/*@AndroidFindBy(xpath= "//android.widget.ListView/android.widget.LinearLayout[@index='+FlagIndexValue']")
	private WebElement flagImage;*/
	
	@AndroidFindBy(xpath="//android.widget.EditText[@resource-id='com.iambank.debug:id/edt_phone']")
	private WebElement numberTextbox;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Next']")
	private WebElement nextBtn;
	
	//@AndroidFindBy(xpath="//android.widget.FrameLayout/android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private WebElement smsPopUp;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.iambank.debug:id/intro_small_txt')]")
	private WebElement legalNameMsg;
	
	@AndroidFindBy(xpath="//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']")
	private WebElement popUp;

	public NumberPage(AndroidDriver driver) {
		super(driver);
	}
	
	public NumberPage defaultFlagIcon() {
		defaultFlag.click();		
		return new NumberPage(driver);
	}
	
	public void selectFlag(String FlagIndexValue) {
		WebElement flagImage=driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout[@index='"+FlagIndexValue+"']"));
		flagImage.click();		
	}
	
	public void enterNumber(String PhoneNumber) {
		numberTextbox.sendKeys(PhoneNumber);
	}
	
	public void clickNextBtn() {
		nextBtn.click();
	}
	
	public void popUpPage() {
		WebElement popUp=driver.findElement(MobileBy.xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
		popUp.click();
	}
	
	public boolean verifyNamePage(String expectedNumberMsg) {
		String NextBtn= legalNameMsg.getText();		
		if (NextBtn.contains(expectedNumberMsg)){
			return true;
		}
		else {
	
		return false;
	}
		}

}
