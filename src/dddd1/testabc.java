package dddd1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class testabc {

	public static void main(String[] args) throws InterruptedException {
		

		
WebDriver driver=new FirefoxDriver();

Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.get("http://208.112.88.220/WhStaging/");
		
		Thread.sleep(4000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1100)");
		
		WebElement ele =  driver.findElement(By.xpath(".//*[contains(text(), 'Family')]"));
		
		ele.click();
		
		System.out.println(ele.getText());
		
		WebElement ele1 = driver.findElement(By.xpath(".//*[contains(text(),'selling')]"));
		
		String str = ele1.getText();
		
		System.out.println(str);
		//String textheading1 ele.getText();
		
		if (str.contains("We've been selling wholesale hats, wholesale caps, and fashion headwear since Jimmy")){
			
			System.out.println("text verified");
			
		}
		
		
		
		
		
	}

}
