package com.wbl.common;

import org.openqa.selenium.WebDriver;

public abstract class CommonPage {
	public CommonPage(WebDriver driver){
		   this.driver=driver;
	   }
	   public WebDriver driver;
}



