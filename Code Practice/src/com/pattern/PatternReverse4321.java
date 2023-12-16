package com.pattern;

import java.util.Scanner;

public class PatternReverse4321 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =1;
		 while (n>=i) {
			int j =n;
			while (j<=n) {
				System.out.print(j+" ");
				j--;
				if (j==0) {
					break;
				}
			}
			System.out.println();
			 i++;
		}
		
		
	}

}
