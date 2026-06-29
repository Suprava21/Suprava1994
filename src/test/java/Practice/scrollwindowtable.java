package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scrollwindowtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//@Test
	
	public void scrollpractice() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy('0,500')");
		Thread.sleep(5000L);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//Fetching the values from the table and sum it and compare the sum with the UI value.
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<values.size();i++)
		{
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
		}
	
	@Test
	
	public void fetchcolumnrowtable() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> secondrow =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for(int i=0;i<secondrow.size();i++)
		{
			System.out.println(secondrow.get(i).getText());
		}
		
	}

}
