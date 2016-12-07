package com.wbl.Test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.common.CommonTest;
import com.wbl.page.ResourcesPage;

public class ResourcesPageTest extends CommonTest {
		  ResourcesPage rp;
		  @BeforeClass
		  public void beforeClass(){
			  rp= new ResourcesPage (driver);
		  }
		  
		@Test
		  public void testResourcesGalleryAction(){
			  assertTrue(rp.ResourcesClick());
		  }
}
