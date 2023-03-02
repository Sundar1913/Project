package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEleven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtFirst = driver.findElement(By.id("firstName"));
		txtFirst.sendKeys("sundar");
		
		WebElement txtLast = driver.findElement(By.id("lastName"));
		txtLast.sendKeys("periyasamy");
		
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("sundartheni9087@gmail.com");
		
		WebElement txtPass = driver.findElement(By.name("Passwd"));
		txtPass.sendKeys("9876abcd@");
		
		WebElement txtconfirm = driver.findElement(By.name("ConfirmPasswd"));
		txtconfirm.sendKeys("9876abcd@");
		
		WebElement btnShow = driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
		btnShow.click();
		
		WebElement btnNext = driver.findElement(By.className("VfPpkd-vQzf8d"));
		btnNext.click();
		
	}
}
