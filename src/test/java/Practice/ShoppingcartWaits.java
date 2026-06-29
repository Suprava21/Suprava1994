package Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingcartWaits {

	public static void main(String[] args) {
		
	}
	//@Test
	
	public void addToCart()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/Seleniumpractice/");
		driver.manage().window().maximize();
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			
			if(name.contains("Cucumeber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		driver.quit();
		
	}
	
	//@Test
	public void addToCartArray() throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/Seleniumpractice/");
		driver.manage().window().maximize();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*We save the items in a array because it takes less memory then ArrayList and when any complex scenario 
		 	comes up that time we use Array List*/
		int j=0;
		String[] itemNeeded = {"Cucumber","Brocolli","Beetroot"};
		Thread.sleep(3000);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++)
		{
			
			//Brocolli - 1kg
			//If split then "Brocolli ", " 1Kg"
			
			String[] name=products.get(i).getText().split("-");
			//To removed white spaces we use Trim
			String formattedName = name[0].trim();
			//Format it to get actual vegetable name as it contains -1kg.
			//Convert Array in to arraylist for better search
			//Check whether name you extracted is present in arrayList or not\
			
			List itemNeededList = Arrays.asList(itemNeeded);
			
			if(itemNeededList.contains(formattedName))
				System.out.println(formattedName);
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//Break cant be used in the array list so using another loop.
				//break;
				//We use length() method to get the size of an array and use size() to get the size of the array list.
				if(j==itemNeeded.length)
					break; //If 1 statement then no braces required.
			}
		}
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));//As its already declared in line no 87.
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		//driver.quit();
		
	}
	
	//@Test
	public void loginPagePractice() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(7));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		WebElement choice=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(choice);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Checkout")));
		
		List<WebElement> values= driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<values.size();i++)
		{
			System.out.println(i);
			values.get(i).click();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.partialLinkText("Checkout")).click();
		driver.quit();
	}
	
	@Test
	public void FluentWait()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){

			@Override
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else
					return null;			
			}
			
		});
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		
	}
	

}
