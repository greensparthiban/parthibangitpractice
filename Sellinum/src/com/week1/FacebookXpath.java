package com.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookXpath {

	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		//xpath
		
		//Syntax //tagname[@attributename ='attributevalue']
		
		WebElement email = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		email.sendKeys("parthi");
		
		
		//xpath contains
		
		//syntax //tagname[contains(@attributename,'constantattributevalue')]
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		
		email.sendKeys("2345");
		
		
		//xpath index
		
		//Syntax (//tagname[contains(@attribuename,'constantattributevalue')])[index value]
		
		
		WebElement acc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		acc.click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]"));
		
		firstname.sendKeys("parthi");
		
		
		//xpath text
		
		//sytax://tagname[text()='text value']
		
		WebElement title = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		
		String text = title.getText();
		
		System.err.println(text);
		
		
		//xpath partial text
		
		
		WebElement p = driver.findElement(By.xpath("//p[contains(text(),'contact information')]"));
		
		String text2 = p.getText();
		
		System.out.println(text2);
		
		
		
		
		
		
	}
}
