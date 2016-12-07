package com.wbl.page;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.wbl.common.CommonPage;
import com.wbl.helper.WblBy;

public class PortalPage extends CommonPage {

	public PortalPage(WebDriver driver) {
		super(driver);
	}
	public int SocialIcons(){	
	List<WebElement>elements = driver.findElements(WblBy.getBy("css-portal-social"));
	return elements.size();
		
	}
	public boolean isLogoPresent(){
		return driver.findElement(WblBy.getBy("id-portal-logo")).isDisplayed();
	}
	
	public int navItems(){
		return driver.findElements(WblBy.getBy("css-portal-nav")).size();
	}
	
	public boolean footerBar(){
		return driver.findElement(WblBy.getBy("id-portal-footer")).isDisplayed();
	}
}
	
     

