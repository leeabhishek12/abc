package dddd1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
	
		
	    WebDriver driver = new FirefoxDriver();


		// maximize the window

		driver.manage().window().maximize();

	// open application

		driver.get("http://jqueryui.com");

		// Wait for 5 seconds

		Thread.sleep(5000);
		
		 
		  // Here below xpath will select 8 Element
		  
		 List<WebElement> links=driver.findElements(By.xpath(".//*[@id='menu-top']/li"));
		 
		 // print the total number of elements
		  System.out.println("Total element is "+links.size());
		 
		 
		 // Now using Iterator we will iterate all elements
		Iterator<WebElement> i1=links.iterator();
		    
		 
		// this will check whether list has some element or not
		while(i1.hasNext()){
		    
		 
		   // Iterate one by one
		    WebElement ele1=i1.next();
		    
		 
		    // get the text
		    String name=ele1.getText();
		    
		    if(name.equalsIgnoreCase("demos"))
		    
		 
		   // print the text
		    System.out.println("Elements name is "+name);
		    
		    break;
		
}
	
	}
	
}

