package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.log4j.Logger;
public class ExcelUtils {
	 private static String LOCATION= System.getProperty("user.dir")+"\\resources\\";
	 private static  Logger logger = Logger.getLogger(ExcelUtils.class);
     public static Object[][] getExcelData(String sheetName,String fileName){
      Object[][] data = null;  
      if(logger.isDebugEnabled()){
      logger.debug("In Excel data reading");
      }
      try{
        
		XSSFWorkbook  wb= new XSSFWorkbook(new FileInputStream(LOCATION+"data\\"+fileName));
         XSSFSheet sheet= wb.getSheet(sheetName);
         int noOfRows= sheet.getLastRowNum();
         data = new Object[noOfRows][];
         Row row=null;
         for(int i=1;i<=noOfRows;i++){
    	     row=sheet.getRow(i);
    	     int noOfcolumns=row.getLastCellNum();
    	     String[] strData = new String[noOfcolumns];
       	     for(int j=0;j<noOfcolumns;j++){
    		  strData[j]=row.getCell(j).getStringCellValue();
    	  } 
    	      data[i-1]= strData;
        }
      }
      catch(FileNotFoundException f){
   	   logger.error("File Not Found.Give correct file details");
   	}
   	catch(IOException e){
   	   logger.error("Issues");
   	}
      return data;
      
}
}
