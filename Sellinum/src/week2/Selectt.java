package week2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectt {
	
	//its predefined class we have import from selenium package.
	
	//Select s=new Select(Webelement ref);
	
	//There are three methods to select,
	
	//SelectByIndex();
	//SelectByValue();
	//SelectByVisible();
	
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		//select by index
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s= new Select(day);
		
		s.selectByIndex(19);
		
		//select by value
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1=new Select(month);
		
		s1.selectByValue("3");
		
		
		//select by visible text
		
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2= new Select(year);
		
		s2.selectByValue("2024");
		
		
		
		List<WebElement> options = s1.getOptions();
		
		for(int i=0; i<options.size();i++) {
			WebElement a = options.get(i);
			
			System.out.println(a.getText());
			
			
		}
		
		
		List<WebElement> options2 = s2.getOptions();
		
		int size = options2.size();
		
		System.out.println("Year of size:"+size);
		
		
		
		
		
	}
	
	

}
