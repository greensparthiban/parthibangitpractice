package com.week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
			
			
		
		
	}

}
