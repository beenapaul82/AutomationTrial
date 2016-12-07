package com.wbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wbl.helper.WblBy;

public class LoginPage extends PortalPage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public String login(String uname,String pwd){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(WblBy.getBy("id-login-uname")));
		element.sendKeys(uname);
		driver.findElement(WblBy.getBy("id-login-password")).sendKeys(pwd);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(WblBy.getBy("id-login-submit")));
		return driver.getTitle();
		
	}
	public int breadCrumbs(){
		return driver.findElements(WblBy.getBy("css-login-bc")).size();
		
	}
	public void forgotClick(){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.findElement(WblBy.getBy("link-home-login")).click();
		wait.until(ExpectedConditions.elementToBeClickable(WblBy.getBy("id-login-forgotpassword")));
	}
	
	

}
