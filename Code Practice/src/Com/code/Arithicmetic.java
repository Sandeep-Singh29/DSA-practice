package Com.code;

import java.util.Scanner;

public class Arithicmetic {

	public static void main(String[] args) {
		
		  Scanner scn = new Scanner(System.in);
		  System.out.println("Enter a name");
	        String name =scn.next();
	       
	        char ch = name.charAt(0);
	        System.out.println("enter number");
	        int m1 =scn.nextInt();
	        int m2 =scn.nextInt();
	        int m3 =scn.nextInt();
	        
	        int avg = (m1+m2+m3)/3;
	        
	        System.out.println(ch);
	        System.out.println(avg);
	}

}
