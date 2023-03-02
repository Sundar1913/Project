package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusFifteen {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		Actions action=new Actions(driver);
		action.moveToElement(signin).perform();
		
		WebElement btnclick = driver.findElement(By.xpath("//a[text()='Start here.']"));
		btnclick.click();
		
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("sundar");
		
		WebElement mobNum = driver.findElement(By.id("ap_phone_number"));
		mobNum.sendKeys("9087381660");
		
		WebElement mail = driver.findElement(By.id("ap_email"));
		mail.sendKeys("sundarperiyasamy3@gmail.com");
		
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Sundar@123");
		Thread.sleep(2000);
		
	}
}
