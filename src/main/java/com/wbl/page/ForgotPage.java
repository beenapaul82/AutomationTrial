package com.wbl.page;

import org.openqa.selenium.WebDriver;

import com.wbl.helper.WblBy;

public class ForgotPage extends PortalPage {
	
	public ForgotPage (WebDriver driver)
	{
		super(driver);
	}
	public boolean forgotPassword(){
		driver.findElement(WblBy.getBy("id-login-forgotpassword")).click();
		return driver.findElement(WblBy.getBy("id-login-email")).isDisplayed();
	}
	public int breadCrumbs(){
		return driver.findElements(WblBy.getBy("css-login-bc")).size();
		
	}
}
