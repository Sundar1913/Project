package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("Sundarperiyasamy");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("9087381660");
		
		
	}

}
