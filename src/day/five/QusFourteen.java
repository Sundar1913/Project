package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusFourteen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement Womensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Actions action=new Actions(driver);
		action.moveToElement(Womensfashion).perform();
		Thread.sleep(2000);
		
		WebElement footwear = driver.findElement(By.xpath("(//a[@href='https://www.snapdeal.com/products/womens-footwear'])[1]"));
		action.moveToElement(footwear).perform();
		footwear.click();
		Thread.sleep(2000);
		
		WebElement heels = driver.findElement(By.xpath("//div[text()='Heels for Women']"));
		action.moveToElement(heels).perform();
		heels.click();
		
	}

}
