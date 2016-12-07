package com.wbl.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {
    private static String LOCATION= System.getProperty("user.dir")+"\\resources\\Drivers\\";
    public static WebDriver getDriver(ConfigUtils config){
    	WebDriver driver= null;
    	switch(config.BROWSER){
    	case "firefox":
    		System.setProperty("webdriver.gecko.driver", LOCATION+"geckodriver.exe");
    		driver = new FirefoxDriver();
    		break;
    	case "chrome":
    		System.setProperty("webdriver.chrome.driver", LOCATION+"chromedriver.exe");
    		driver = new ChromeDriver();
    		break;
    	case "ie":
    		System.setProperty("Webdriver.ie.driver", LOCATION+"IEDriverServer.exe");
    		driver = new InternetExplorerDriver();
    		break;
        case "htmlunit":
             driver = new HtmlUnitDriver();
   	         break;
    	case "safari":
    		//System.setProperty("webdriver.safari.driver", LOCATION+"chromedriver.exe");
    		driver = new SafariDriver();
    		break;
    	case "opera":
    		System.setProperty("Webdriver.opera.driver", LOCATION+"operadriver.exe");
    		driver = new OperaDriver();
    		break;
    	default:
    		System.setProperty("Webdriver.chrome.driver", LOCATION+"chromedriver.exe");
       		driver = new ChromeDriver();  			
    		
    	}
    	return driver;
    }
}
