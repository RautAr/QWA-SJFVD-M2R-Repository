package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpathassignment {
	
	//private static String title;

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
	    // Get the window handle of the parent window
		String parentWindowHandle = driver.getWindowHandle();
	
		driver.findElement(By.xpath("/html/body/div[3]/div")).click(); // relative xpath
		
		//Thread.sleep(2000);
		
		//WebElement WebElementallIphone = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		WebElement searchAction= driver.findElement(By.cssSelector("input._3704LK")); 
		searchAction.click();
		
		
	}
}
