package IFElseExample;

import java.util.Arrays;
import java.util.Date;

public class CurrnetYear {
	
	public static void main(String[] args) {
		getCurrnetYear();
		
	}
	
	public static String getCurrnetYear() {
		return String.valueOf(new Date().getYear());
	}

}
