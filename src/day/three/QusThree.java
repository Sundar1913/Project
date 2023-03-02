package day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QusThree {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement txtFirstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtFirstName.sendKeys("Sundar");
		
		WebElement txtLastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtLastName.sendKeys("Periyasamy");
		
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@rows='3']"));
		txtAddress.sendKeys("Theni");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("sundarperiyasamy3@gmail.com");
		
		WebElement txtPhnNum = driver.findElement(By.xpath("//input[@type='tel']"));
		txtPhnNum.sendKeys("9087381660");
		
		WebElement rdoGender = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		rdoGender.click();
		
		WebElement cboxClick = driver.findElement(By.id("checkbox1"));
		cboxClick.click();
		
		WebElement cboxClick1 = driver.findElement(By.id("checkbox2"));
		cboxClick1.click();
		
		WebElement cboxClick2 = driver.findElement(By.id("checkbox3"));
		cboxClick2.click();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select=new Select(skills);
		select.selectByIndex(38);
		
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		Thread.sleep(2000);
		
		WebElement selectcon = driver.findElement(By.xpath("//li[text()='India']"));
		selectcon.click();
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select select1=new Select(year);
		select1.selectByVisibleText("2001");
		
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select select2=new Select(month);
		select2.selectByValue("July");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select select3=new Select(day);
		select3.selectByValue("19");
		
		WebElement txtPassword = driver.findElement(By.id("firstpassword"));
		txtPassword.sendKeys("sundar@123");
		
		WebElement txtConfirm = driver.findElement(By.id("secondpassword"));
		txtConfirm.sendKeys("sundar@123");	
	}
}
