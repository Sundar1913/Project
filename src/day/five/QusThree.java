package day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusThree {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		
		WebElement Home = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));
		action.moveToElement(Home).perform();
		Thread.sleep(2000);
		
		WebElement Bath = driver.findElement(By.xpath("//a[text()='Bath linen']"));
		action.moveToElement(Bath).perform();
		action.click(Bath).perform();
		Thread.sleep(2000);
		
		WebElement txtprint = driver.findElement(By.xpath("(//a[text()='LOFA Microfiber 300 GSM Bath Towel'])[1]"));
		String text = txtprint.getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
