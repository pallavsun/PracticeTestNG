package com.hyr.groupTests;

import org.testng.annotations.Test;

public class NewTest2 {
  
	@Test(groups = {"smoke"})
  public void test4() {
	  System.out.println("Test4");
  }
  
  
  @Test(groups = {"smoke" ,"functional" ,"sanity"})
  public void test5() {
	  
	  System.out.println("Test5");
  }
  
  
  
  @Test(groups = {"functional" ,"regression"})
  public void test6() {
	  
	  System.out.println("Test6");
  }
  
  
  
  
  
}
