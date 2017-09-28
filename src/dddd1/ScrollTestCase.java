package dddd1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollTestCase {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");	
		
		System.out.println("scroll complete");
		
		
	}

}
