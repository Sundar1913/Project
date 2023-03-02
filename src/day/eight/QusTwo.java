package day.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTwo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement btnOkCan = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] "));
		btnOkCan.click();
		WebElement btnConfirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		btnConfirm.click();
		
		
	}

}
