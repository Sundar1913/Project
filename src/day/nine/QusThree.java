package day.nine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QusThree {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnCreate = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		btnCreate.click();
		Thread.sleep(2000);
		
		WebElement Yr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select select=new Select(Yr);
		List<WebElement> option = select.getOptions();
		for (WebElement options : option) {
			String attribute = options.getAttribute("value");
			System.out.println(attribute);
		}
			
	}

}
