package day.twelve;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement btnLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		btnLogin.click();
		
		WebElement txtNum = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','9087381660')", txtNum);
		Object printNum = executor.executeScript(" return arguments[0].getAttribute('value')", txtNum);
		System.out.println(printNum);
		Thread.sleep(2000);
		
		WebElement btnGetotp = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		executor.executeScript("arguments[0].click()", btnGetotp);
		
	}

}
