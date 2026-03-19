package com.week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommentsNavication {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		
		driver.get("https://www.facebook.com/");
		
		
	}
}
