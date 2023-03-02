package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSix {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Sundar");
		String attribute = txtUser.getAttribute("value");
		System.out.println(attribute);
	
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("sundar@123");
		String attribute2 = txtPass.getAttribute("value");
		System.out.println(attribute2);
		
	}

}
