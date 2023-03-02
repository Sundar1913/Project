package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTwo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnTrainer = driver.findElement(By.id("home-tab"));
		btnTrainer.click();
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Velmurugan currently')]"));
		String text = txt.getText();
		System.out.println(text);
	}
}
