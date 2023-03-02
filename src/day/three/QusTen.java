package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement imgClick = driver.findElement(By.xpath("//img[@alt='ACs']"));
		imgClick.click();
		
		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();
	}

}
