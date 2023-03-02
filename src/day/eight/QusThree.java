package day.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusThree {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textBox.click();
		WebElement promtBox = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promtBox.click();
	}

}
