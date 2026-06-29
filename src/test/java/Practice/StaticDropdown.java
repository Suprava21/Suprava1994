package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaticDropdown {
	
	//@Test
	public void Staticdd(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with Select Tag - Static
		WebElement staticDrp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDrp);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.close();	
		
	}
	
	//@Test
	public void updatedDropdown() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();
	}
	//@Test
	
	public void DynamicDp() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value = 'HYD']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value = 'BLR'])[2]")).click();  
		//To ignore the indexing in xpath, we can always use parent xpath//child xpath(Parent child relationship xpath
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.close();
	}
	//@Test
	
		public void calendar() throws InterruptedException {

			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			driver.findElement(By.xpath("//a[@value = 'HYD']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[@value = 'BLR'])[2]")).click();  
			//To ignore the indexing in xpath, we can always use parent xpath//child xpath(Parent child relationship xpath
			//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
			
			driver.findElement(By.cssSelector(".ui-state-default ui-state-active")).click();
			driver.close();
		}
	
	//@Test
	
	public void AutoSuggestive() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option :options){
			if(option.getText().equalsIgnoreCase("India"))
			{				
		option.click();		
		break;

		}

		}
		
	}
	
	//@Test
		public void Checkbox() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			/*Assert.assertFalse(false);
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());*/
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			//Count the number of Checkboxes
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			Thread.sleep(2000);
			driver.findElement(By.id("divpaxinfo")).click();
			
		    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			int i=1;
			while(i<5) {
				driver.findElement(By.id("hrefIncAdt")).click();
				i++;
			}
			driver.findElement(By.id("btnclosepaxoption")).click();
			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			driver.close();
		}
	
	//@Test
	public void EnabledDisabledUIElements() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		driver.close();
	}
	
	@Test
	
	public void Practice() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Suprava Panigrahi");
		driver.findElement(By.name("email")).sendKeys("suprav@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Suprava@1");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Gender= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown= new Select(Gender);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("21-08-1994");
		driver.findElement(By.cssSelector(".btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
	}
	
	
	//@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		StaticDropdown sd = new StaticDropdown();
		//sd.Staticdd();
		//sd.updatedDropdown();
		sd.DynamicDp();
		sd.AutoSuggestive();
		sd.Checkbox();
		

	}

}
