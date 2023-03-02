package day.ten;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusNine {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement btnCls = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnCls.click();
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		txtSearch.sendKeys("redmi phone",Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement fstProd = driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]"));
		fstProd.click();
		
		String parWin = driver.getWindowHandle();
		Set<String> chilWin = driver.getWindowHandles();
		for (String eachWin : chilWin) {
			if (!parWin.equals(eachWin)) {
				driver.switchTo().window(eachWin);
			}
		}
		WebElement cost = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = cost.getText();
		System.out.println(text);
	}

}
