package com.wbl.Test;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.common.CommonTest;
import com.wbl.page.HomePage;

public class HomePageTest extends CommonTest {
  HomePage hm;
  @BeforeClass
  public void beforeClass(){
	  hm= new HomePage (driver);
  }
  
@Test
  public void testCountSlides(){
	  assertEquals(6,hm.countSlides());
  }
  
  @Test
  public void testVideoElement(){
	assertTrue(hm.videoElement());  
  }
  @Test
  public void testSectionHeaders(){
	 assertTrue(hm.SectionHeaders()); 
  }
  
  
}
