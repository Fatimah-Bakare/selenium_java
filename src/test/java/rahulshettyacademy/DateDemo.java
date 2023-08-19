package rahulshettyacademy;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		//current date ... current time.
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy"); 
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
