package day.seven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSix {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement txtSelenium = driver.findElement(By.xpath("//a[@title='Continuous Testing in DevOps']"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", txtSelenium);
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\eclipse-workspace\\Locators\\Screenshot\\Qus6.png");
		FileUtils.copyFile(src, des);
		
		
	}

}
