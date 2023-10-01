package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestExcel {

	@Test(dataProvider = "logindata",dataProviderClass = ExcelDataSupplier.class)
	public void TestLogin(String username,String password) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	 
	
	driver.get("https://www.nopcommerce.com/en/login");
	
	driver.findElement(By.id("Username")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(password);
    Thread.sleep(4000);
	
	
	
	}

	
	
	
	
	
	
	
	
}
