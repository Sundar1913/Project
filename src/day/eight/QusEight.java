package day.eight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEight {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		
		WebElement txtuserId = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtuserId.click();
		txtuserId.sendKeys("Sundar");
		Thread.sleep(2000);
		
		WebElement txtpassWord = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpassWord.click();
		txtpassWord.sendKeys("sundar@123");
		Thread.sleep(2000);
		
		WebElement btnlogIn = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		btnlogIn.click();
		
	}

}
