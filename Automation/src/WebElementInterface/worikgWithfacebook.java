package WebElementInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class worikgWithfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//lauch the webapplication
		driver.get("https://www.facebook.com/");
		
		//identify the email
		driver.findElement(By.name("email")).sendKeys("aparna2@gmail.com");
		
		//identify the password
		driver.findElement(By.name("pass")).sendKeys("Raut@12");
		
		//click on create new account
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		//enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Aparna");
		
		//enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Raut");
		
		//enter the mobile no. and password 
		driver.findElement(By.name("reg_email__")).sendKeys("aparna2@gmail.com");
		
		//enter the new password
		driver.findElement(By.id("password_step_input")).sendKeys("Raut@1234");
		
		//select the date
		Select sDate = new Select(driver.findElement(By.id("day")));
		sDate.selectByVisibleText("20");
		
		//select the month
		Select sMonth = new Select(driver.findElement(By.id("month")));
		sMonth.selectByVisibleText("jun");
		
		//select the year
		Select sYear = new Select(driver.findElement(By.id("year")));
		sYear.selectByVisibleText("2000");
		
		driver.findElement(By.id("u_k_4_da")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
	}

}
