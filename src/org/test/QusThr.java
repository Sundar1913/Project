package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusThr {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get(" https://www.google.com/");
		 
		 WebElement txtEnter = driver.findElement(By.name("q"));
		 txtEnter.sendKeys("GreensTechnology");
	}
}
