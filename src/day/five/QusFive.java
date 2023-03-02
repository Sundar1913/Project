package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusFive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html ");
		driver.manage().window().maximize();
		
		WebElement Sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions action=new Actions(driver);
		action.moveToElement(Sports).perform();
		
		WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		weight.click();
		
		
	}

}
