package parallelScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

import com.aventstack.extentreports.ExtentReports;


public class ExtentReport1 {
	
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	@BeforeTest
	public void setupExtent()
	{
	extentReports = new ExtentReports();
	spark =new ExtentSparkReporter("test-output/SparkReport.html")
			.viewConfigurer()
			.viewOrder()
			.as(new ViewName[] {
					ViewName.DASHBOARD,
					ViewName.TEST,
					ViewName.AUTHOR,
					ViewName.DEVICE,
					ViewName.LOG
			}).apply();
	extentReports.attachReporter(spark);
	
	
	}

		
	

	@BeforeMethod
	public void setup()
	{
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		extentTest.assignAuthor("AutomationTester")
		.assignCategory("Regression")
		.assignDevice(System.getProperty("os.name"))
		.assignDevice(System.getProperty("os.version"));
		
	/*{if(ITestResult.FAILURE==result.getStatus())
		extentTest.log(Status.FAIL,result.getThrowable().getMessage());
		//String strpath = Utility.*/
		driver.close();
	}
  @Test
  public void cucumberSearchTest() {
	  extentTest= extentReports.createTest("cucumber Search test");
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
  
  
  @Test
  public void seleniumSearchTest() {
	  
	  
	  extentTest= extentReports.createTest("selenium Search test");
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
	
	  extentTest= extentReports.createTest("Appium Search test");
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("appium Tutorial");
		srcBox.submit();
		//srcBox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "appium Tutorial - Google Search");	
		
}
  @AfterTest
  
  public void finishExtent()
  {
  extentReports.flush();
  
} 
}
