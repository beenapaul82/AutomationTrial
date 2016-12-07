package com.wbl.page;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.wbl.helper.WblBy;

public class FAQPage extends PortalPage {
	public FAQPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean checkTitle(){
		return driver.findElement(WblBy.getBy("class-faq-title")).isDisplayed();
	}
	public int countQuestions() throws InterruptedException,IOException{
		try{
		driver.findElements(WblBy.getBy("css-faq-question"));
		}catch (Exception e){
		File file1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("C:\\Users\\beena\\Desktop\\screenshotexample.png"));
		}
		return driver.findElements(WblBy.getBy("css-faq-question")).size();
		
	}
	public boolean checkCopyright(){
		return driver.findElement(WblBy.getBy("class-faq-copyright")).isDisplayed();	
	}
	public int countSocialIcons(){
		return driver.findElements(WblBy.getBy("css-faq-socialicons")).size();	
	}
}
