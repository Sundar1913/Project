package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement jstClick = driver.findElement(By.id("signin-block"));
		jstClick.click();
		
		WebElement btnSignup = driver.findElement(By.xpath("//li[@id='signInLink']"));
		btnSignup.click();
		
		WebElement txtMobnum = driver.findElement(By.xpath("(//input[@class='IP'])[1]"));
//		txtMobnum.click();
//		Thread.sleep(2000);
		txtMobnum.sendKeys("9087381660");
		
	}

}
