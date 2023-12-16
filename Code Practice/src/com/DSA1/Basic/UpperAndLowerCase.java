package com.DSA1.Basic;

import java.util.Scanner;

public class UpperAndLowerCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        char ch = str.charAt(0);
        
        if(ch>=65 && ch<=90){
            System.out.println("1");
        }else if(ch>=97 && ch<=122){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
		
	}

}
