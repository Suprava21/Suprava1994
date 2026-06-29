package TestNGFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class day3 {
	
	@Parameters({"URL","APIKey/usrname"})
	@Test
	public void WebLoginHomeLoan(String urlname, String key)
	{
		System.out.println("WebLoginHome");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(timeOut=4000) //This means it wont fail till the time 4 secs
	public void MobileSigninHomeLoan()
	{
		System.out.println("Mobile signin");
	}
	
	@Test(enabled=false)
	public void MobileLogoutHomeLoan()
	{
		System.out.println("Mobile logout");
	}
	
	@Test(dataProvider="getData")
	public void LoginAPIHomeLoan(String username, String password)
	{
		System.out.println("LoginAPIHome");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		//1st combo- Username & password - Good credit score
		//2nd combo - Username & Password - No credit score
		//3rd combo - Username & password - Fraud. 
		//This are the 3 test data set for which we have to run the test case 3 times.
		
		Object[][] data=new Object[3][2]; //3 rows(3 data set and 2 columns(Uname & Pwd)
		//1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		//3rdset
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;	
		
	}
	
}
