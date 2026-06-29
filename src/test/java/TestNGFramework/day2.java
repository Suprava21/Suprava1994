package TestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCar");
	}
	
	@BeforeClass
	public void beforeClas()
	{
		System.out.println("I will execute before any methods in day 2 class");
	}
	
	@AfterClass
	public void afterClas()
	{
		System.out.println("I will execute after all the methods in day 2 class");
	}
	
	 @BeforeMethod
	 
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in day 2 class.");
	}
	
	 @AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will execute after every method in day 2 class.");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(dependsOnMethods={"WebLoginCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICar");
	}
	

}
