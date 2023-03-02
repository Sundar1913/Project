package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusThirteen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement mobile = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		Actions action=new Actions(driver);
		action.moveToElement(mobile).perform();
		Thread.sleep(2000);
		
		WebElement backcover = driver.findElement(By.xpath("//span[text()='Printed Back Covers']"));
		backcover.click();
		
		
	}

}
