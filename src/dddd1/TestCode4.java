package dddd1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCode4 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/09/how-to-work-with-disable-textbox-or.html");
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("document.getElementById('pass').value= 'abhishek';");

	}

}
