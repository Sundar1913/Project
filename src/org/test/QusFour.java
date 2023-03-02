package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusFour {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		

		WebElement btnClick = driver.findElement(By.id("user-id-goahead"));
		btnClick.click();
		
		WebElement txtUserId = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtUserId.sendKeys("Sundar");
		
		WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpassword.sendKeys("9087381660");

	}

}
