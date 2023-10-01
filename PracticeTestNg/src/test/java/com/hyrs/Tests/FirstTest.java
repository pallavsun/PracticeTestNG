package com.hyrs.Tests;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	
	@Test

	public void TestGoogle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials",Keys.ENTER);
		
		String ExpectedTitle="HYR Tutorials - Google Search";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,ExpectedTitle,"Title is mismatched");
		System.out.println(actualTitle);
   }
	
	@Test
	public void TestFacebook() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("Admin" ,Keys.ENTER);
		Thread.sleep(5000);
		
		SoftAssert softAssert=new SoftAssert();
		
		
	// URL Assertion
		String actualUrl=driver.getCurrentUrl();
  		String expectUrl= "https://www.facebook.com";
  		softAssert.assertNotEquals(actualUrl, expectUrl,"URL is mismatched");
		
		
		
  //  Title Assertion
    	String actualTitle=driver.getTitle();
		String expectTitle="Facebook – log in or sign up" ;
		softAssert.assertEquals(actualTitle, expectTitle,"Title is mismatched");
	
	    
	   driver.quit();
	
	softAssert.assertAll();	
		
		
	}


	
	
}
