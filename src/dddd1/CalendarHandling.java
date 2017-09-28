package dddd1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarHandling {

	public static void main(String[] args)
	{
		

		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		
		for(WebElement ele:alldates)
		{
			String date = ele.getText();
			
			System.out.println("all dates are"+date);
			
			if(date.equalsIgnoreCase("30"))
			{
				ele.click();
				break;
			}
		}
	}

}
