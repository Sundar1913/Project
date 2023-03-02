package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusEleven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement btnLogin = driver.findElement(By.className("_1_3w1N"));
		btnLogin.click();
		
		WebElement txtNum = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		txtNum.sendKeys("9087381660");
		String attribute = txtNum.getAttribute("value");
		System.out.println(attribute);
	}

}
