package testScripts;
//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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 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
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement srcBox = driver.findElement(By.className("gLFyf"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
	
		
	}

}
