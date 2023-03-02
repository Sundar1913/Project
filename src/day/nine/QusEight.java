package day.nine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtName = driver.findElement(By.id("username"));
		txtName.sendKeys("vijaysai");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("devarakonda");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		
	}

}
