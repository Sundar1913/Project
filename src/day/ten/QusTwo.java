package day.ten;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusTwo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearch.sendKeys("Iphone 7",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement fstProd = driver.findElement(By.xpath("(//div[contains(@class,'product-')])[2]"));
		fstProd.click();
		
		String parWin = driver.getWindowHandle();
		Set<String> chiWin = driver.getWindowHandles();
		for (String eachWin : chiWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
			}
			
		}
		WebElement btnCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		btnCart.click();
		Thread.sleep(2000);
		
		WebElement Cost = driver.findElement(By.xpath("//div[contains(text(),'You Pay: ')]"));
		String text = Cost.getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}
}
