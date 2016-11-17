package com.cybage.test;

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

public class TestCode {

	@BeforeGroups("Example")
	public void beforeGroup()
	{
		System.out.println("Before Example Group");
	}
	
	@BeforeSuite
	public void beforeTestsuite()
	{
		System.out.println("Before Test Suite");
	}
	
	@BeforeClass
	public void beforeClassExample()
	{
		System.out.println("Before Class Executed");
	}
	
	@BeforeTest
	public void beforeExampleTest()
	{
		System.out.println("Before Test Executed");
	}
	
	@BeforeMethod
	public void beforeExampleMethod()
	{
		System.out.println("Before Method is Executed");
	}
	
	@Test(groups="Example") 	
	 public void exampleOfTestNgMaven1() { 
	        System.out.println("This is TestNG-Maven Example : 1"); 
	    } 
	 
	 @Test(groups="Example") 	
	 public void exampleOfTestNgMaven2() { 
	        System.out.println("This is TestNG-Maven Example : 2"); 
	    }
	 
	
	 @AfterMethod
	 public void afterExampleMethod()
	{
		System.out.println("After Method is Executed");
	}
	 
	 @AfterTest
	 public void afterExmapleTest()
	 {
		 System.out.println("after Test Executed");
	 }
	 
	 @AfterClass
	 public void afterClassExample()
	 {
		 System.out.println("After Class Executed");
	 }
	 
	 @AfterSuite
	 public void afterTestSuite()
	 {
		 System.out.println("After Test Suite.");
	 }
	 
	 @AfterGroups("Example")
	 public void afterGroups()
	 {
		 System.out.println("After Example Group");
	 }

}
