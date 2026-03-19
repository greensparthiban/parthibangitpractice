package com.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//id
		
		WebElement email = driver.findElement(By.id("email"));
		
		//sendkeys
		
		
		email.sendKeys("Parthiban12@gmail.com");
		
		//name
		
		WebElement password = driver.findElement(By.name("pass"));
		
		password.sendKeys("pa1234$");
		
		//tagname
		
		
		WebElement title = driver.findElement(By.tagName("h2"));
		
		//gettext
		
		String text = title.getText();
		
		System.out.println(text);
		
		WebElement login = driver.findElement(By.name("login"));
		
		//click
		
		login.click();
		
		
			
		
		
		
	}

}
