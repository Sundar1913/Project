package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusSeven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.className("header-browse-greens"));
		Actions action=new Actions(driver);
		action.moveToElement(course).perform();
		
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		action.moveToElement(oracle).perform();
		
		WebElement sql = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
		sql.click();
		
		
	}

}
