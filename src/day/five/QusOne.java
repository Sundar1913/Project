package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.id("bank"));
		action.dragAndDrop(src, dest).perform();
		Thread.sleep(1000);
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest2 = driver.findElement(By.id("amt7"));
		action.dragAndDrop(src2, dest2).perform();
		Thread.sleep(1000);
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dest3 = driver.findElement(By.id("loan"));
		action.dragAndDrop(src3, dest3).perform();
		Thread.sleep(1000);
		
		WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement dest4 = driver.findElement(By.id("amt8"));
		action.dragAndDrop(src4, dest4).perform();
		
	}

}
