package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEdit {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		
		//typecasting
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scroll(0,3000)");
		
		//Thread.sleep(3000);
		
		//js.executeAsyncScript("window.scrool(0,-3000)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		WebElement ch = driver.findElement(By.xpath("(//img[@loading='lazy'])[39]"));
		
		js.executeScript("arguments[0].scrollIntoview(true)",ch);
		
		Thread.sleep(3000);
		js.executeScript("auguments[0].scrollIntoView(false)",ch);
		
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].click()",ch);
		
		Thread.sleep(3000);
		
		js.executeScript("history.go(0)");
		
		
		
		
		
		
		
		
		
	}

}
