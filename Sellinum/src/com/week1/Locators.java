package com.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//linktext
		
		//WebElement fp = driver.findElement(By.linkText("Forgotten password?"));
		
		//fp.click();
		
		//partial linktext
		
		//WebElement acc = driver.findElement(By.partialLinkText("new account"));
		
		//acc.click();
		
		//css selector
		
		//id
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		
		email.sendKeys("parthi");
		
		//class
		
		
		driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		
		email.sendKeys("pa123@");
		
		//=======================================================================
		
		//classname
		
		WebElement title = driver.findElement(By.className("_8eso"));
		
		String text = title.getText();
		
		System.out.println(text);
		
		
		
		;
		
		
		
	}

}
