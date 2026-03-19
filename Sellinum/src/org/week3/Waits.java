package org.week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.instagram.com/");
		
		
		//Thread.sleep(3000);
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.HOURS);
		
		WebElement name = driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d _ap35'][1]"));
		
		name.sendKeys("Parthi");
		
		
		
	}

}
