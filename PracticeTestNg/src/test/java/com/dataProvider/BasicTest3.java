package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest3 {

	@Test(dataProvider ="dp1")
	public void TestLogin(String s) throws InterruptedException
	{
	System.out.println(s);
	
	}

	
	@DataProvider(indices = {0,2})
	public String[] dp1()
	{
		String data[]=new String[]
	{			
	      "Pallav",
	      "Amit",
	      "Sumit",
	      "Reema"
			
	};		
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
}
