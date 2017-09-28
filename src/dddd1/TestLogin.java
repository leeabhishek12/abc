package dddd1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class TestLogin {
	@Test
     public void TestRobo() throws Exception   
	{

	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("mukesh");
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	}

  }
