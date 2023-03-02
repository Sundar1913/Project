package day.twelve;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTwo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		
		WebElement last = driver.findElement(By.xpath("//div[@class='row find-us-row text-white justify-content-center align-items-center']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", last);
		
		Thread.sleep(2000);
		
		WebElement first = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		executor.executeScript("arguments[0].scrollIntoView(false)", first);
		
	}

}
