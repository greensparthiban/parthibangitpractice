package com.week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/"); 
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.instagram.com/");
		
		Thread.sleep(4000);
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
	}
}
