package day.nine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QusTwelve {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		
		WebElement fruit = driver.findElement(By.id("fruits"));
		Select select=new Select(fruit);
		List<WebElement> options = select.getOptions();
		int size=options.size();
		
		for (int i = 1; i < options.size(); i=i+2) {
			List<WebElement> op = select.getOptions();
			
			
		
		}
	}

}
