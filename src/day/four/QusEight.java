package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtName = driver.findElement(By.id("username"));
		txtName.sendKeys("Sundar");
		String attribute = txtName.getAttribute("value");
		System.out.println(attribute);
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("sundar@123");
		String attribute2 = txtPassword.getAttribute("value");
		System.out.println(attribute2);
	}

}
