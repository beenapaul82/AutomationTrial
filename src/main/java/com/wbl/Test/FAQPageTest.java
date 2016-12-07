package com.wbl.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.io.IOException;

import com.wbl.common.CommonTest;
import com.wbl.page.FAQPage;
import com.wbl.pageFlow.FAQPageFlow;

  public class FAQPageTest extends CommonTest{
	  FAQPage fa;
	  @BeforeClass
	  public void beforeClassFAQ(){
		  fa= new FAQPage (driver);
		  FAQPageFlow.faqClickButton(driver);
		 
    }
	  	 
	@Test
	public void testCheckTitle(){
		assertTrue(fa.checkTitle());
	}
	@Test
	public void testCountQuestions() throws InterruptedException,IOException{
		try {
			assertEquals(14,fa.countQuestions());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testCheckCopyright(){
		assertTrue(fa.checkCopyright());
	}
	@Test
	public void testCountsocialIcons(){
		assertEquals(4,fa.countSocialIcons());
	}	  
	  
}
