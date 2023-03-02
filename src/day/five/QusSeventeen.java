package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusSeventeen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement fashion = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[3]"));
		Actions action=new Actions(driver);
		action.moveToElement(fashion).perform();
		
		WebElement womenFW = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		action.moveToElement(womenFW).perform();
		
		WebElement womenFlats = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		womenFlats.click();
	}

}
