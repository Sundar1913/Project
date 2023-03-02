package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusNineteen {
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
		
		WebElement elctronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action=new Actions(driver);
		action.moveToElement(elctronics).perform();
		Thread.sleep(2000);
		
		WebElement realme = driver.findElement(By.xpath("//a[@title='Realme']"));
		realme.click();
		Thread.sleep(2000);
		
		WebElement fstProduct = driver.findElement(By.xpath("(//a[contains(@href,'/realme-')])[1]"));
		fstProduct.click();
	}
}



