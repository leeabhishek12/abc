package dddd1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateinJava1 {

	public static void main(String[] args) {
		
		
		SimpleDateFormat dateformate = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		String date1 = dateformate.format(date);
		
		System.out.println(date1);
		
	}

}
