package TestNGFramework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day0 {
	
	@AfterTest
	
	public void LastTest()
	{
		System.out.println("I will execute Last"); //This will be executed in the end of that particular Test <test name="Personal Loan">
	}
	
	@Test
	public void FirstTest()
	{
		System.out.println("Hello");
	}
	
	@AfterSuite
	
	public void afterSuite()
	{
		System.out.println("I am the No 1 from last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}
	
	

}
