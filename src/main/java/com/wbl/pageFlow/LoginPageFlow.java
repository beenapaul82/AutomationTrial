package com.wbl.pageFlow;

import org.openqa.selenium.WebDriver;

import com.wbl.page.HomePage;

public class LoginPageFlow extends HomePage{
   
	public LoginPageFlow(WebDriver driver) {
		super(driver);
		
	}
	public static void goToLogin(WebDriver driver){
		HomePage hm = new HomePage(driver);
		hm.loginClick();
	}

}
