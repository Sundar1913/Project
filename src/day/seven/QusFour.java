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

public class QusFour {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@type='button']"));
		btnClose.click();
		Thread.sleep(2000);
		
		WebElement Lnkporur = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", Lnkporur);
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\DELL\\eclipse-workspace\\Locators\\Screenshot\\Qus4.jpeg");
		
		FileUtils.copyFile(src, des);
		
		
		
	}

}
