package WorkingWithDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
						
		//maximize the browser
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		
		//identify multi-select dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		//create the object of select class
		Select s = new Select(dropdown);
		
		s.selectByVisibleText("India");
		
		s.selectByVisibleText("United States");
		
		//deselect
		s.deselectByVisibleText("Canada");
		
		s.deselectByVisibleText("United Kingdom");
		

	}
}