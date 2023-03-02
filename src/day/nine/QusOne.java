package day.nine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QusOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		WebElement st = driver.findElement(By.id("state"));
		Select select=new Select(st);
		List<WebElement> options = select.getOptions();
		int size=options.size();
		for (int i = 0; i < options.size(); i++) {
			if (i%2==0) {
				System.out.println(options.get(i).getText());
			}
		}	
	}
}
