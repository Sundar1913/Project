package day.ten;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusFour {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		WebElement btnClose = driver.findElement(By.xpath("(//button[@data-dismiss='modal'])[1]"));		
//		btnClose.click();
//		Thread.sleep(18000);
//		
//		WebElement btnClos = driver.findElement(By.xpath("(//button[@class='close'])[1]"));
//		btnClos.click();
//		
		Thread.sleep(5000);
		WebElement selenium = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		selenium.click();
		
		WebElement day10task = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		day10task.click();
		
		WebElement btnWinHan = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		btnWinHan.click();
		
		String parWin = driver.getWindowHandle();
		Set<String> chiWin = driver.getWindowHandles();
		for (String allWin : chiWin) {
			if (!parWin.equals(allWin)) {
				driver.switchTo().window(allWin);
			}
		}
		WebElement Question = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		String text = Question.getText();
		System.out.println(text);
		
		
	}

}
