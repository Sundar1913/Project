package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEight {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearch.sendKeys("hand sanitizer",Keys.ENTER);
		
		WebElement fstProduct = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		fstProduct.click();
		
		String parWIn = driver.getWindowHandle();
		Set<String> ChilWin = driver.getWindowHandles();
		for (String eachWin : ChilWin) {
			if (!parWIn.equals(eachWin)) {
				driver.switchTo().window(eachWin);
			}
		}
		WebElement btnCart = driver.findElement(By.xpath("//span[text()='add to cart']"));
		btnCart.click();
	}

}
