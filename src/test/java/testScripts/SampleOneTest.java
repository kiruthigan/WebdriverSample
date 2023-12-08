package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleOneTest {
  @Test
  public void cucumberSearchTest() {
	  
	  
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
	  
	  
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
