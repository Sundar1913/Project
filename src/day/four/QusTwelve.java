package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTwelve {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		
		WebElement txtProduct = driver.findElement(By.id("autocomplete"));
		txtProduct.sendKeys("Boys Shirts");
		
		WebElement btnSearch = driver.findElement(By.xpath("//a[text()='Search']"));
		btnSearch.click();
		
		WebElement Select = driver.findElement(By.xpath("//img[contains(@id,'det_img_')]"));
		Select.click();
		
	}

}
