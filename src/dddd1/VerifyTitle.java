package dddd1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	
	
	@Test(retryAnalyzer=Retry.class)
	
	public void verifySeleniumTitle()
	{
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://www.learn-automation.com");
		 Assert.assertTrue(driver.getTitle().contains("QTP"));
		 
	}

}
