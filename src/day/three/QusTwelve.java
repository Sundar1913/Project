package day.three;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusTwelve {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		WebElement Move = driver.findElement(By.className("accountInner"));
		action.moveToElement(Move).perform();
		
		WebElement newReg = driver.findElement(By.className("newUserRegister"));
		newReg.click();
		
		WebElement txtNum = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		txtNum.sendKeys("9087381660");
}
}