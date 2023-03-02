package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusNine {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement txtEnter = driver.findElement(By.name("keyword"));
		txtEnter.sendKeys("soft toy");
		
		WebElement btnSearch = driver.findElement(By.className("searchTextSpan"));
		btnSearch.click();
		
		WebElement btnTouch = driver.findElement(By.xpath("//img[contains(@class,'product')]"));
		btnTouch.click();
		
	}

}
