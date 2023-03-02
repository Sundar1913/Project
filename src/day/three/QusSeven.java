package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSeven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtFrom = driver.findElement(By.id("from_station"));
		txtFrom.sendKeys("Chennai");
		
		WebElement txtTo = driver.findElement(By.id("to_station"));
		txtTo.sendKeys("Madurai");
		
		WebElement btnSearch = driver.findElement(By.id("trainFormButton"));
		btnSearch.click();
		
	}

}
