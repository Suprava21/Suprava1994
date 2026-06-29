package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class realtimeexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//@Test
	
	public void linkcounts() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//link count from whole screen.
		System.out.println(driver.findElements(By.tagName("a")).size());
		//creating subset of driver and fetch the link count for only the footer.
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//fetching the number of links from the first column of the footer section
		WebElement footerColumn = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerColumn.findElements(By.tagName("a")).size());
		
		//Click on each link in the first column section in the footer and check if the pages are opening.
		for(int i=1;i<footerColumn.findElements(By.tagName("a")).size();i++)
		{
			//Opening all the tabs together in that column footer by using Control + Enter key
			String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000L);
		}
		
		Set<String> windows=driver.getWindowHandles();
	    Iterator<String> it=windows.iterator();
	    
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
		
		
		driver.quit();			
		
	}
	
	@Test
	
	public void practiceexercise() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).click();
		String options = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(options);
		driver.findElement(By.id("name")).sendKeys(options);
		driver.findElement(By.id("alertbtn")).click();
		String text=driver.switchTo().alert().getText();
		if(text.contains(options))
		{
			System.out.println("Alert message success");
		}
		else
			System.out.println("Alert message unsuccessful");
	}
	
	

}
