package day.twelve;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusFive {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.name("username"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','sundar')", txtUsername);
		
		WebElement txtPass = driver.findElement(By.id("password"));
		executor.executeScript("arguments[0].setAttribute('value','sundar@123')", txtPass);
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		executor.executeScript("arguments[0].click()", btnLogin);
		
	}

}
