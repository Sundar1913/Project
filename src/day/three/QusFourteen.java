package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusFourteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		
		WebElement btnSignup = driver.findElement(By.className("r2iyh"));
		btnSignup.click();
		
		WebElement txtMobile = driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("9087381660");
		
		WebElement txtName = driver.findElement(By.id("name"));
		txtName.sendKeys("sundar");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("sundarperiyasamy3@gmail.com");
		
		WebElement btnContinue = driver.findElement(By.className("a-ayg"));
		btnContinue.click();
		
	}

}
