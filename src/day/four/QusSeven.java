package day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QusSeven {
	public static void main(String[] args) {
		System.setProperty("webdrver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement txtType = driver.findElement(By.name("q"));
		txtType.sendKeys("greens velmurugan");
		
		WebElement btnSearch = driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
		btnSearch.click();
		
		WebElement Link = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		Link.click();
	}

}
