package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusEleven {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement All = driver.findElement(By.xpath("(//a[text()='All Departments'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(All).perform();
		
		WebElement heatcool = driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		action.moveToElement(heatcool).perform();
		
		WebElement ac = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		action.moveToElement(ac).perform();
		
		WebElement portable = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		portable.click();
	}

}
