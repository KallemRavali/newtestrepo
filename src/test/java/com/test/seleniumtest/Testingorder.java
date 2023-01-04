package com.test.seleniumtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingorder  {

	@BeforeSuite
	public void SetUp1() {
		
		System.out.println("Setup method is for chrome or any browser ");
			
	}
	
	
	
	
	@BeforeTest
	public void launchbrowser1() {	
		System.out.println("launch browser ");
	}
	@AfterTest
	public void deletecachecookiesanything() {
		System.out.println("deletecookies");

	}

	@BeforeGroups
	@Test
	public void nameofthepagetitle() {	
		System.out.println("getpagetitle ");
	}
	
	@AfterGroups
	@BeforeClass
	public void logintoapplication1() {		
		System.out.println("logintoapplication ");
		
	}
	@AfterClass
	public void closebrowser1() {
		System.out.println("close browser");
	}
	@BeforeMethod
	public void enterurl1() {
		System.out.println("enterurl ");
				
	}
	
	@AfterMethod
	public void logintoapplication() {
		System.out.println("logoutfromapplication ");
	}
	
}

	