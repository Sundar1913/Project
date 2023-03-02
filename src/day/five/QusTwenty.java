package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusTwenty {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement mobile = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[2]"));
		mobile.click();
		Thread.sleep(2000);
		
		WebElement tvs = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		Actions action=new Actions(driver);
		action.moveToElement(tvs).perform();
		Thread.sleep(2000);
		
		WebElement mi = driver.findElement(By.xpath("//a[@title='Mi']"));
		mi.click();
		Thread.sleep(2000);
		
		WebElement fstProduct = driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]"));
		fstProduct.click();
	}
}



