package Locator;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithLocator {
	
	public  static void main(String[] args)
	{
		Random r = new Random();
		
		int no = r.nextInt();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.get("https://www.instagram.com/");
		
		driver.switchTo().activeElement().sendKeys("instagram",Keys.ENTER);
		
		driver.findElement(By.name("username")).sendKeys("aparna@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("aparna@123");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.className("_add6")).click();
	}

}
