package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class WblBy {
	static Properties locatorsProp = null;
	private static  Logger logger = Logger.getLogger(WblBy.class);
	public static void loadProperties(String fileName){
		locatorsProp= new Properties();
		try{
			locatorsProp.load(new FileInputStream(System.getProperty("user.dir")+"\\resources\\"+fileName));
		}catch(FileNotFoundException f){
	    	logger.error("File Not Found.Give correct file details");
	    	}
	    	catch(IOException e){
	    	logger.error("Issues");
	    	}		
	}
	
  public static By getBy(String key){
	  By by=null;
	  String value=locatorsProp.getProperty(key);
	  if(key.startsWith("id")){
		  by= By.id(value);
	  }
	  else if(key.startsWith("css")){
		  by= By.cssSelector(value);
	  }
	  else if(key.startsWith("link")){
		  by= By.linkText(value);
	  }
	  else if(key.startsWith("name")){
		  by=By.name(value);
	  }
	  else if(key.startsWith("plink")){
		  by=By.partialLinkText(value);
	  }
	  else if(key.startsWith("xpath")){
		  by=By.xpath(value);
	  }
	  else if(key.startsWith("tag")){
		  by=By.tagName(value);
	  }
	  else if(key.startsWith("class")){
		  by=By.className(value);
	  }
	  return by;
  }
}
