package com.week1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		//driver.manage().window().maximize();
		
		Dimension d=new Dimension(400,200);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(4000);
		
		Point p= new Point(500,500);
		
		driver.manage().window().setPosition(p);
	}

}
