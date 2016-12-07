package com.wbl.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wbl.helper.WblBy;

public class HomePage extends PortalPage{

	public HomePage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	public void loginClick(){
		driver.findElement(WblBy.getBy("link-home-login")).click();
	}
	public void faqClick(){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(WblBy.getBy("link-faq-faq")));
		
	}
	public int countSlides(){
		return driver.findElements(WblBy.getBy("css-home-slides")).size();
	}
	public boolean SectionHeaders(){
		return driver.findElement(WblBy.getBy("css-home-section-headers")).isDisplayed();
	}
	public boolean videoElement(){
		return driver.findElement(WblBy.getBy("css-home-video-elm")).isEnabled();
	}
   
}
