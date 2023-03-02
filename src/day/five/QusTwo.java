package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class QusTwo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
		action.moveToElement(prime).perform();
		
		Thread.sleep(2000);
		
		WebElement join = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		join.click();
		
	}

}

