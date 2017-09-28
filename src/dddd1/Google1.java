package dddd1;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google1 {

	public static void main(String[] args) {
	
		
		Logger logger = Logger.getLogger("Google1");
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver = new FirefoxDriver();
		logger.info("open browser");
		
		driver.get("https://www.google.co.in/");
		logger.info("url opened");
		
	}

}
