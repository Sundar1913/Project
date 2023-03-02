package day.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSeven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.xpath("//input[@class='form-control text-muted']"));
		userId.sendKeys("Sundar");
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[@ondblclick='return fLogon()']"));
		btnLogin.click();	
	}

}
