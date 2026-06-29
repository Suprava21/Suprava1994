package TestNGFramework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	

}
