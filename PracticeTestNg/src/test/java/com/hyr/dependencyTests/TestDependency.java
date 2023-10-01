package com.hyr.dependencyTests;

import org.testng.annotations.Test;

public class TestDependency {

	static String trackingNumber=null;
	
	@Test
	public void CreateShipment() {
		
		System.out.println(5/0);
		System.out.println("CreateShipment");
		trackingNumber="ABC12YH";
		
	}
	
	
	@Test(dependsOnMethods = {"CreateShipment"},alwaysRun = true )
	public void TrackShipment() throws Exception {
		
	if(trackingNumber!=null)
	 System.out.println("TrackShipment");	
	
	else
		throw new Exception("invalid Tracking no");
		   
	}
	
	
	@Test (dependsOnMethods = {"CreateShipment","TrackShipment"} )
	public void CancelShipment() throws Exception {
		
	if(trackingNumber!=null)
	 System.out.println("TrackShipment");	
			
	else
	throw new Exception("invalid Tracking no");
				   
			}	
		
	
	
	
	
	
} 
