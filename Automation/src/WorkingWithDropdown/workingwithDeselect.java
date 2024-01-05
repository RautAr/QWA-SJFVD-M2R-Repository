package WorkingWithDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithDeselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
				
		//maximize the browser
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(dropdown);
		
		for(int i=0;i<5;i++)
		{
			Thread.sleep(2000);
			s.selectByIndex(i);
		}
		for(int i=0;i<5;i++)
		{
            Thread.sleep(2000);
            s.deselectByIndex(i);
		}		

	}

}
