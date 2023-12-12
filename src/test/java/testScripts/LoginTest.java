package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
WebDriver driver;
Properties prop;
	
	@BeforeMethod
	public void setup() throws Throwable {
		
		String path = System.getProperty("user.dir")+"//ConfigFiles//Config.properties"	;
		FileInputStream fin = new FileInputStream(path);
		
		 prop = new Properties();
		 prop.load(fin);
		 
		
		
		
				driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void validLogin() {
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector("button.radius")).click();
		boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
