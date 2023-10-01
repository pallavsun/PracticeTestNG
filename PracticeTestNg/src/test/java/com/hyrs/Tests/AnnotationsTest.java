package com.hyrs.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsTest {
  @Test
  public void testmethod1() {
	  System.out.println("Test Method");
  }
  
  
  @Test
  public void testmethod2() {
	  System.out.println("Test Method2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  
     System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("after suite");
  }

}
