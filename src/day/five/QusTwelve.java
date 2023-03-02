package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusTwelve {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement All = driver.findElement(By.xpath("(//a[text()='All Departments'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(All).perform();
		
		WebElement paint = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		action.moveToElement(paint).perform();
		
		WebElement interior = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		action.moveToElement(interior).perform();
		
		WebElement ceiling = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		ceiling.click();
	}

}



