package com.wbl.pageFlow;


import org.openqa.selenium.WebDriver;

import com.wbl.page.LoginPage;

public class ForgotPageFlow extends LoginPage {

	public ForgotPageFlow(WebDriver driver) {
		super(driver);
		
	}
	public static void forgotLogin(WebDriver driver){
		LoginPage lp = new LoginPage(driver);
		lp.forgotClick();
	}

}

