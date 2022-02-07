package com.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("I am running before suite");
		
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am running before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am running before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am running before Method");
	}
	
	@Test(priority = 1)
	public void LoginTest() {
		System.out.println("I am the Login Test");
	}
	
	@Test(priority = 3, dependsOnMethods = {"LoginTest"})
	public void CheckProfileTest() {
		System.out.println("I am the Check Profile Test");
	}
	
	@Test(priority = 2, invocationCount = 50)
	public void SearchTest() {
		System.out.println("I am the Search Test");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am running after Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am running after Class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am running after Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am running after Suite");
	}

}
