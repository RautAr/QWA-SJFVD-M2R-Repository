package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkwithDemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Reg")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("aparna");
		
		driver.findElement(By.name("LastName")).sendKeys("raut");
		
		driver.findElement(By.name("Email")).sendKeys("raut@123gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("divya@123");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("divya@123");
		
		driver.findElement(By.className("register-next-step-button")).click();
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.name("Email")).sendKeys("raut@123gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("divya@123");
		
		driver.findElement(By.className("login-button")).click();
		
	}
}
