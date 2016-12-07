package com.wbl.pageFlow;

import org.openqa.selenium.WebDriver;

import com.wbl.page.HomePage;

public class FAQPageFlow extends HomePage{
	public FAQPageFlow(WebDriver driver) {
		super(driver);
		
	}
	
	public static void faqClickButton(WebDriver driver){
		HomePage hm = new HomePage(driver);
		hm.faqClick();
	}
}
