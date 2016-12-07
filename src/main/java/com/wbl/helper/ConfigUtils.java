package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConfigUtils{
    public final String BROWSER;
    public final String URL;
    Properties prop;
    private static  Logger logger = Logger.getLogger(ConfigUtils.class);
    public ConfigUtils(String fileName){
    	logger.info("Reading the Config File");
    	prop = new Properties();
    	try{
   		prop.load(new FileInputStream(System.getProperty("user.dir")+"\\resources\\"+fileName));
       	}
    	catch(FileNotFoundException f){
    	   logger.error("File Not Found.Give correct file details");
    	}
    	catch(IOException e){
    	   logger.error("Issues");
    	}
    	BROWSER = prop.getProperty("browser");
   		URL = prop.getProperty("url");
    	
    	
    }
}
