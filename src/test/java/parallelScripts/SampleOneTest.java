package parallelScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleOneTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.close();
	}
  @Test
  public void cucumberSearchTest() {
	  
		driver.get("https://www.google.com");
		//SoftAssert softassert = new SoftAssert();
		System.out.println(driver.getTitle());
		//softassert.assertEquals(driver.getTitle(), "Google1");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("cucumber Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "cucumber Tutorial - Google Search");
		//softassert.assertAll();
	  
	/*	driver.get("https://www.google.com");
		SoftAssert softassert = new SoftAssert();
		System.out.println(driver.getTitle());
		softassert.assertEquals(driver.getTitle(), "Google1");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("cucumber Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "cucumber Tutorial - Google Search");
		softassert.assertAll();
		
		//driver.close();*/
  }
  
  
  @Test(priority=1)
  public void seleniumSearchTest() {
	  
	  
	  
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("selenium Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "selenium Tutorial - Google Search");
		//driver.close();
		
		
		
		
		
		
  }
  
  @Test
  public void appiumSearchTest() {
	
	  
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("appium Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "appium Tutorial - Google Search");	
		
}
 /* @AfterTest
  
  public void closin()
  {
  
  driver.close();
} */
}
