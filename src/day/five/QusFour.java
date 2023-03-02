package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusFour {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement Mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		action.moveToElement(Mobile).perform();
		
		WebElement Smart = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		Smart.click();
		
		WebElement Range = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		action.moveToElement(Range).perform();
		Range.click();
		
		
		
	}

}
