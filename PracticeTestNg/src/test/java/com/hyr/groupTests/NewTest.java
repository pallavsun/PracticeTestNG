package com.hyr.groupTests;


import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test(groups = {"smoke","sanity"})
  public void test1() {
	  System.out.println("Test1");
  }
  
  
  @Test(groups = {"regression" ,"sanity"})
  public void test2() {
	  
	  System.out.println("Test2");
  }
  
  
  
  @Test
  public void test3() {
	  
	  System.out.println("Test3");
  }
  
  
  
  
  
}
