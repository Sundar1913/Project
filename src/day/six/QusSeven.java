package day.six;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusSeven {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement Selenium = driver.findElement(By.xpath("(//h2[@class='mb-0'])[5]"));
		action.moveToElement(Selenium).perform();
		Selenium.click();
		
		WebElement Day6 = driver.findElement(By.xpath("(//a[text()=' DAY 6 TASK'])[1]"));
		action.contextClick(Day6).perform();
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		for (int i = 0; i < 6; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			
	}
	

}
