package org.week3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("pen",Keys.ENTER);
		
		WebElement pen = driver.findElement(By.xpath("(//img[@class='UCc1lI'])[5]"));
		
		pen.click();
		
		String parent = driver.getWindowHandle();
		
		System.out.println("First Tab"+parent);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
