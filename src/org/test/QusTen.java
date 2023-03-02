package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/\r\n");
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("sundarperiyasamy");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("9087381660");
		
		
	}
	
	

}
