package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		String str = driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
		//td[contains(text(),'B. Wagner')]//following-sibling::td[5]
		System.out.println("salary " + str);
	}

}
