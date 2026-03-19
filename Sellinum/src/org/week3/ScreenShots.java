package org.week3;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.id("click")).click();
		
		driver.switchTo().defaultContent();
		
		
		//type casting
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File sa = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sa, new File("C:\\Parthiban\\jan7.1.png"));
		
		System.out.println("ScreenShot Taken Successfully");
		
		
		Date d=new Date();
		
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
	}

}
