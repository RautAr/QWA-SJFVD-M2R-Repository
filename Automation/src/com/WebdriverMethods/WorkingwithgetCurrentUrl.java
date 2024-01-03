package com.WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithgetCurrentUrl {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://www.flipkart.com/"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}


