package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class sslcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	
	public void badsslcheck() {
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
