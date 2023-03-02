package day.eight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement Continue = driver.findElement(By.className("login_button"));
		Continue.click();
		
		WebElement logIn = driver.findElement(By.id("Button2"));
		logIn.click();
		
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		
	}

}
