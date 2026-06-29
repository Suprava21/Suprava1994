package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocatorsTest {

    WebDriver driver;

    // TestNG Test method
    @Test
    public void testSignUpClick() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/"); //Script will wait till the time all components of the page is loaded.
        driver.manage().window().maximize();
        driver.navigate().to("www.google.com");// script doesnt wait for all the components to load. Doesnt have implcit wait involved in this.
        //driver.manage().back();
        driver.findElement(By.xpath("(//a[contains(text(),'Sign Up')])[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println(driver.findElement(By.xpath("//label[contains(text(),'Full name')]")).getText());
       //Assert.assertEquals(driver.findElement(By.xpath("//label[contains(text(),'Full name')]")).getText(), "My name is suprava");
        
        driver.close();
    }

    // Keeping main method as requested
    public static void main(String[] args) {
        LocatorsTest obj = new LocatorsTest();
        obj.testSignUpClick();
    }
}