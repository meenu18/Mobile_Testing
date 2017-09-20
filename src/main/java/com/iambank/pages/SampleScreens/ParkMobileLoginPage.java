package com.iambank.pages.SampleScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.app.pages.baseclasses.CopyOfMobileBasePage;
import com.app.pages.baseclasses.MobileBasePage;

public class ParkMobileLoginPage  extends CopyOfMobileBasePage {
		
		@FindBy(xpath="//a[@class = 'ssp-pm-navLink-signOut base-font']")
		 private WebElement logoutbutton;
				
		
		public ParkMobileLoginPage (WebDriver driver) {
			super(driver);
			
		}
		public ParkmobileHomePage enterUsernamePswd(String adminuser, String adminpswd){
			WebElement username=driver.findElement(By.name("userName"));
			WebElement password = driver.findElement(By.name("password"));
			WebElement loginbutton = driver.findElement(By.name("loginBtn"));
			username.sendKeys(adminuser);
			password.sendKeys(adminpswd);
			loginbutton.click();
			return new ParkmobileHomePage(driver);		
		}
				
		
	}


