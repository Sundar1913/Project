package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("Theni");
	}

}
