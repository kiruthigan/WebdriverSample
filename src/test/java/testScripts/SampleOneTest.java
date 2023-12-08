package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleOneTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
  @Test
  public void cucumberSearchTest() {
	  
	  
	  
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("cucumber Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "cucumber Tutorial - Google Search");
		
		driver.close();
  }
  
  
  @Test
  public void SeleniumSearchTest() {
	  
	  
	  
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("selenium Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "selenium Tutorial - Google Search");
		
		driver.close();
		
		
		
  }
}
