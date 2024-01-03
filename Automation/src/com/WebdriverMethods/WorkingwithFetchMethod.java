package com.WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithFetchMethod {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zomato.com/india");
		
		String actualtitle = driver.getTitle();
		
		String url = driver.getCurrentUrl(); 
		
		driver.close();
	}

}
