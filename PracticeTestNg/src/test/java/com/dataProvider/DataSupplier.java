package com.dataProvider;

import org.testng.annotations.DataProvider;

public class DataSupplier {

	

	@DataProvider
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
