package day.ten;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QusOne {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("Iphone x",Keys.ENTER);
		
		WebElement fstProduct = driver.findElement(By.xpath("(//img[contains(@class,'s')])[1]"));
		Actions action=new Actions(driver);
		action.contextClick(fstProduct).perform();
		
		Robot robot=new Robot();
		for (int i = 0; i < 1; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		String parentWin = driver.getWindowHandle();
		System.out.println(parentWin);
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		for (String eacchWin : allWin) {
			if (!parentWin.equals(eacchWin)) {
				driver.switchTo().window(eacchWin);
			}
			WebElement Cost = driver.findElement(By.xpath("(//span[text()='$138.99'])[1]"));
			String text = Cost.getText();
			System.out.println(text);
		}
		
	}
}
		
		
		
		
		
//		Set<String> childWin = driver.getWindowHandles();
//		List<String>listallwindowid=new LinkedList<String>();
//		listallwindowid.addAll(childWin);
//		String child = listallwindowid.get(1);
//		driver.switchTo().window(child);
//		Thread.sleep(4000);
		
		
		
		
