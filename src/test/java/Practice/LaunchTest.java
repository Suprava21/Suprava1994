package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchTest {

	@Test
    public void launchBrowser() {

       WebDriver driver = new ChromeDriver(); // Selenium Manager handles driver
	   //WebDriver driver = new FirefoxDriver(); 
		//WebDriver driver = new EdgeDriver();
		
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
