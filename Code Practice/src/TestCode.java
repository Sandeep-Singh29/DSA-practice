import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class TestCode {

//	public static void main(String[] args) {

//		String s = "Jammu";
//		s = s.trim();
//		String camelCaseString = "";
//		if (s.equals("")) {
//			return;
////		return camelCaseString;
//		}
//		String[] split = s.split(" ");
//		for (String sp : split) {
//			camelCaseString = camelCaseString + " " + String.valueOf(sp.charAt(0)).toUpperCase()
//					+ sp.substring(1, sp.length()).toLowerCase();
//		}
//		camelCaseString = camelCaseString.trim();
//		System.out.println(camelCaseString.replace("&", "and"));
		
//		return camelCaseString.trim();
		
	
	 public static void main(String[] args) {
		 
		 
//	        String inputDate = "Jan 23, 2023";
//	        String currentDate = "Jun 23, 2023";
//	        Date d = new Date();
//	        DateFormat inputFormat = new SimpleDateFormat(d);
//	        DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
//
//	        try {
//	            Date date = inputFormat.parse(inputDate);
//	            String outputDate = outputFormat.format(date);
//	            Date current = inputFormat.parse(currentDate);
//	            String outputCurDate = outputFormat.format(current);
//	            System.out.println(outputDate);
//	            System.out.println(outputCurDate);
//	        } catch (ParseException e) {
//	            e.printStackTrace();
//	        }
		 
		 
		 String inputDate = "2/june/2016";
	        String inputFormat = "dd/MMMM/yyyy";
	        String outputFormat = "dd-MM-yyyy";

	        SimpleDateFormat inputDateFormat = new SimpleDateFormat(inputFormat);
	        SimpleDateFormat outputDateFormat = new SimpleDateFormat(outputFormat);

	        try {
	            Date date = inputDateFormat.parse(inputDate);
	            String outputDate = outputDateFormat.format(date);
	            System.out.println("Converted date: " + outputDate);
	        } catch (ParseException e) {
	            System.out.println("Error parsing date: " + e.getMessage());
	        }
	    
		
		   
		
		
		

	}
}
