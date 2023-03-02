package day.seven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusThirteen {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearch.sendKeys("HP laptop",Keys.ENTER);
		Thread.sleep(2000);
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\DELL\\eclipse-workspace\\Locators\\Screenshot\\Qus13.png");
		FileUtils.copyFile(src, des);	
		
		
	}

}
