package day.eight;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusOne {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btnAlert = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btnAlert.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
