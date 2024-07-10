package pearl.SmartER.Other;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	
	
	public static String dateAndTime() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_YY HH:mm:ss");
		 
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);

		 // Print the Date
		 System.out.println("Current date and time is " +date1);
		 
		 String datetime1= date1.substring(9, 17).toString();
		 
		 System.out.println("Current date and time is " +datetime1);
		 
		 return datetime1;
		
	}
	
//	 public static void main(String[] args) {
//		 
//		 // Create object of SimpleDateFormat class and decide the format
//		 //DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//		 
//		 DateFormat dateFormat = new SimpleDateFormat("dd_MM_YY HH:mm:ss");
//		 
//		 
//		 
//		 //get current date time with Date()
//		 Date date = new Date();
//		 
//		 // Now format the date
//		 String date1= dateFormat.format(date);
//
//		 // Print the Date
//		 System.out.println("Current date and time is " +date1);
//		 
//		 String s= date1.substring(9, 17).toString();
//		 
//		 System.out.println("Current date and time is " +s);
//		 
//		 }


}
