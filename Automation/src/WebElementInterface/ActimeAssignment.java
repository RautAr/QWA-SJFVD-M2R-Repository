package WebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActimeAssignment {

	private static final By By = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=e25rnsstouj4");
		
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.cssSelector("[class='label']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"customersProjectsForm\"]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys("sayli");

	}

}
