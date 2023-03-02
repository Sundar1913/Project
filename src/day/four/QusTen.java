package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement txtEnter = driver.findElement(By.name("q"));
		txtEnter.sendKeys("iPhone");
		
		WebElement btnSearch = driver.findElement(By.className("L0Z3Pu"));
		btnSearch.click();
		
		WebElement Select = driver.findElement(By.xpath("//a[contains(@href,'/apple-iphone-')][1]"));
		Select.click();
	}

}
