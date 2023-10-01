package com.hyr.dependencyTests;

import org.testng.annotations.Test;

public class TestGroupdependency {
	
	@Test(groups="smok")
	public void test1() 
	{
		System.out.println("smoke");
		
	}
	
	
	@Test(groups="smok")
	public void test2() 
	{
		System.out.println("smoke");
		
	}
	
	
	@Test(groups="smok")
	public void test3() 
	{
		System.out.println("smoke");
		
	}
	
	@Test(groups="sanit")
	public void test4() 
	{
		System.out.println("sanity");
		
	}
	
	
	@Test(groups="sanit")
	public void test5() 
	{
		System.out.println("sanity");
		
	}
	
	

	@Test(groups="regress")
	public void test6() 
	{
		System.out.println("regression");
		
	}
	
	

	@Test(groups="regress")
	public void test7() 
	{
		System.out.println("regression");
		
	}
	
	
	
//	@Test(dependsOnGroups = {"smok","sanit"} )
//	public void test0() 
//	{
//		System.out.println("main test");
		
//	}
	
	
	

}
