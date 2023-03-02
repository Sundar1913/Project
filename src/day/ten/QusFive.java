package day.ten;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusFive {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@type='button']"));
		btnClose.click();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions action=new Actions(driver);
		action.moveToElement(course).perform();
		Thread.sleep(2000);
		
		WebElement python = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		python.click();
		Thread.sleep(2000);
		
		WebElement btnCls = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
		btnCls.click();
		Thread.sleep(15000);
		
		WebElement btnCls1 = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
		btnCls1.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
