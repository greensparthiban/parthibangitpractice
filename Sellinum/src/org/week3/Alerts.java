package org.week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		
		//simple alert
		
		WebElement a = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		
		a.click();
		
		Thread.sleep(3000);
		
		Alert sa = driver.switchTo().alert();
		
		sa.accept();
		
		Thread.sleep(3000);
		
		
		//confirm Alert
		
		WebElement a1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		
		a1.click();
		
		Thread.sleep(3000);
		
		Alert ca = driver.switchTo().alert();
		
		ca.dismiss();
		
		Thread.sleep(3000);
		
		//prompt alert
		
		WebElement a2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]"));
		
		a2.click();
		
		Thread.sleep(3000);
		
		Alert pa = driver.switchTo().alert();
		
		pa.sendKeys("parthi");
		
		pa.accept();
		
		Thread.sleep(3000);
		
		
		//Sweet Alert
		
	 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[1]")).click();
	 
	 Thread.sleep(3000);
	 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
