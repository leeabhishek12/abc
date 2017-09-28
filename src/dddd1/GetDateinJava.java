package dddd1;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetDateinJava {

	public static void main(String[] args) 
	{
		
		//create the simple date format of simpledateformat class
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//get current date time and date()
		Date date= new Date();
		
		//now format the date
		String date1= dateFormat.format(date);
		
		//print the date
		System.out.println(date1);
		
}
	
}

