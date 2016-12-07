package com.wbl.Test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.common.CommonTest;
import com.wbl.page.HomePage;
import com.wbl.page.PortalPage;

public class PortalPageTest extends CommonTest {
	PortalPage pp;
	  @BeforeClass
	  public void beforeClass(){
		  pp= new HomePage (driver);
	  }	  
	@Test
	  public void testSocialIcons(){
		  assertEquals(4,pp.SocialIcons());
	  }
	@Test
	 public void testIsLogoPresent(){
		assertTrue(pp.isLogoPresent());
	}
	@Test
	 public void testNavItems(){
		assertEquals(14,pp.navItems());
	}
	@Test
		public void testFooterBar(){
		   assertTrue(pp.isLogoPresent());
		}
}
