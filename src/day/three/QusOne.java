package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement btnClick = driver.findElement(By.id("twotabsearchtextbox"));
		btnClick.click();
		
		WebElement txtEnter = driver.findElement(By.id("twotabsearchtextbox"));
		txtEnter.sendKeys("iphone");
		
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();
		
	}

}
