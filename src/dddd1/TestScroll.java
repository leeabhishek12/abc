package dddd1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScroll {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		WebDriver driver=new FirefoxDriver();
		 
		 
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		 
		 
		 
		// Pass application URL
		 
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		
		Thread.sleep(3000);
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		

WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
 
 
 
// now execute query which actually will scroll until that element is not appeared on page.
 
je.executeScript("arguments[0].scrollIntoView(true);",element);
 
 
 
// Extract the text and verify
 
System.out.println(element.getText());
	}

}
