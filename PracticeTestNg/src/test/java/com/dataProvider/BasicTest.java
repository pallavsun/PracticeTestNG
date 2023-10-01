package com.dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	@Test(dataProvider = "loginTestData")
	public void TestLogin(String username,String password) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	 
	
	driver.get("https://www.nopcommerce.com/en/login");
	
	driver.findElement(By.id("Username")).sendKeys(username);
	driver.findElement(By.id("Password")).sendKeys(password);
	//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	Thread.sleep(5000);
	//driver.quit();
	
	
	}

	
	@DataProvider(name="loginTestData",parallel = true)
	public Object[][] loginData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		

		data[1][0]="pallav";
		data[1][1]="admin123";
		

		data[2][0]="Ankit";
		data[2][1]="admin123";
		
		

		
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
}
