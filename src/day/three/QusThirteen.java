package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusThirteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement txtNum = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		txtNum.sendKeys("9087381660");
		
		WebElement btnSubmit = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		btnSubmit.click();
	}

}
