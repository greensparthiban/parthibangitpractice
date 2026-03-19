package org.week3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selects {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().frame(1);
		
		WebElement a = driver.findElement(By.xpath("//button[text()='Count Frames']"));
		
		String text = a.getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().parentFrame();
		
		
		List<WebElement> parent = driver.findElements(By.tagName("iframe"));
		
		int size = parent.size();
		
		System.out.println(size);
		
		driver.switchTo().defaultContent();
		
		
List<WebElement> body = driver.findElements(By.tagName("iframe"));
		
		int size1 = body.size();
		
		System.out.println("Total farmes:"+size1);
		
		
		
		
		
		
		
		
	}
}
