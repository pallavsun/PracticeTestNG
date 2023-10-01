package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest4 {

	@Test(dataProvider ="dp1" ,dataProviderClass = DataSupplier.class)
	
	public void TestLogin(String s) throws InterruptedException
	{
	System.out.println(s);
	
	}

	
	
	
	
	
	
	
	
	
}
