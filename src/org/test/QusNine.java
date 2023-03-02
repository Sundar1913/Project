package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusNine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtFirstName.sendKeys("Sundar");
		
		WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtLastName.sendKeys("Periyasamy");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddress.sendKeys("Theni");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("sundarperiyasamy3@gmail.com");
		
		WebElement txtPhnNum = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhnNum.sendKeys("9087381660");
		
		WebElement txtPassword = driver.findElement(By.id("firstpassword"));
		txtPassword.sendKeys("sundar@123");
		
		WebElement txtConfirm = driver.findElement(By.id("secondpassword"));
		txtConfirm.sendKeys("sundar@123");
		
		
	}
	

}
