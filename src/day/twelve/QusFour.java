package day.twelve;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusFour {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtname = driver.findElement(By.id("email"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','Sundar')", txtname);
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		executor.executeScript("arguments[0].setAttribute('value','sundar@123')", txtPass);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()",btnLogin);
		
		
	}

}
