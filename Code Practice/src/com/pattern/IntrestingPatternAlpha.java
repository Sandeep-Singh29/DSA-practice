package com.pattern;

import java.util.Scanner;

public class IntrestingPatternAlpha {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
	    char c=(char)(65+n);
		while (n>=i) {
			int j =1;
			c=(char)(c-i);
			while (j<=i) {
				System.out.print(c);
				j++;
				c++;
			}
			System.out.println();
			i++;
			
		}
		
	}

}
