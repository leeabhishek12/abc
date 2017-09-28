package dddd1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshootGoogle {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		// take screen shot
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(src, new File("C:/Screenshot/" +System.currentTimeMillis() + ".png"));
			System.out.println("Screen shot captured");
		}
		
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	

	}

}
