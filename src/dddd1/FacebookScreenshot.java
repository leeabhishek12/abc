package dddd1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FacebookScreenshot 
{
	
	
      WebDriver driver;	
      
      @Test
      public void capturescreenshot()
      {
    	  
    	  driver = new FirefoxDriver();
    	  driver.get("https://www.google.co.in");
    	  driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("learn automation");
      }
      
      
      @AfterMethod
      
      public void teardown(ITestResult result)
      {
    	  
    	  if(ITestResult.FAILURE==result.getStatus())
    	  {
    		  try
    		  {
    			  TakesScreenshot ts = (TakesScreenshot)driver;
    			  File source = ts.getScreenshotAs(OutputType.FILE);
    			  FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));
    			  System.out.println("Screen shot Taken");
    		  }
    		  
    		  catch(Exception e)
    		  {
    			  System.out.println("Exception while taking screen shot"+e.getMessage());
    		  }
    		  
    	  }
    	  
    	  
    	  
      }
	

}
