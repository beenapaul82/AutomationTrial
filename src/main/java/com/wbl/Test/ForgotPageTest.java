package com.wbl.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import com.wbl.common.CommonTest;
import com.wbl.page.ForgotPage;
import com.wbl.pageFlow.ForgotPageFlow;

public class ForgotPageTest extends CommonTest {
	ForgotPage fp;
	@BeforeClass
	   public void beforeClassForgot(){
		 fp=new ForgotPage (driver);
		 ForgotPageFlow.forgotLogin(driver);
	   }
	
	   @Test
	   public void testForgotpassword(){
		   assertTrue(fp.forgotPassword());
	   } 
	   @Test
	   public void countBreadCrumbs(){
		  assertEquals(3,fp.breadCrumbs());
	   }
}
