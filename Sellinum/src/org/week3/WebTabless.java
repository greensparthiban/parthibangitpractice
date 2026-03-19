package org.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabless {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/webtable/");
		
		WebElement table = driver.findElement(By.id("table01"));
		
	    System.out.println("----------------------------------------");
	    
	    WebElement head = driver.findElement(By.tagName("thead"));
	    
	    System.out.println(head.getText()); 
	    
	    System.out.println("--------------------------------------------");
	    
	    WebElement tb = driver.findElement(By.tagName("tbody"));
	    
	    System.out.println(tb.getText());
	    
	    System.out.println("----------------------------------------------");
	    
	    
	    WebElement row = driver.findElement(By.xpath("//table[@id='table01']//tbody/tr[2]"));
	    
	    System.out.println(row.getText());
	    
	    
	    System.out.println("-------------------------------------------------");
	    
	    
	    WebElement cell = driver.findElement(By.xpath("//table[@id='table01']//tbody//tr[1]//td[4]"));
	    
	    System.out.println(cell.getText());
	    
	    System.out.println("-------------------------------------------------");
	    
	    driver.findElement(By.xpath("//table[@id='table01']//tbody//tr[1]//td[5]")).click();
	    
	    driver.findElement(By.xpath("//table[@id='table01']//tbody//tr[3]//td[1]")).click();
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
