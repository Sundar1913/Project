package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement frameWork = driver.findElement(By.xpath("//div[@id='heading304']"));
		frameWork.click();
		Thread.sleep(2000);
		
		WebElement junit = driver.findElement(By.xpath("//a[text()=' JUNIT']"));
		junit.click();
		
		String parWin = driver.getWindowHandle();
		Set<String> chiWin = driver.getWindowHandles();
		for (String eachWin : chiWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
			}
		}
		WebElement fstqus = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		String text = fstqus.getText();
		System.out.println(text);
	}

}
