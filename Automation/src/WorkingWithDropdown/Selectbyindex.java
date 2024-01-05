package WorkingWithDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbyindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//launch the web application
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		
		//identify the dropdown
		WebElement dropdown = driver.findElement(By.id("select3"));
		
		//create the object of select class
		Select s = new Select(dropdown);
		
		//use select by index
		s.selectByIndex(7);
		
		//using select by value
		//s.selectByValue("United Kingdom");
		
		//using select by visible text
		//s.selectByVisibleText("Poland");
		

	}

}
