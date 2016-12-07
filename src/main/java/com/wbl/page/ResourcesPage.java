package com.wbl.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wbl.helper.WblBy;

public class ResourcesPage extends PortalPage{

	public ResourcesPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean ResourcesClick(){
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(WblBy.getBy("xpath-resources-element")));
		Actions action= new Actions(driver);
		action.clickAndHold(element).perform();
		WebElement subelement=wait.until(ExpectedConditions.visibilityOfElementLocated(WblBy.getBy("xpath-resources-subelement")));
		action.moveToElement(subelement).click().build().perform();
		return driver.findElement(WblBy.getBy("css-resources-heading")).isDisplayed();
	}
	
}
