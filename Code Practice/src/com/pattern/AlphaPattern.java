package com.pattern;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r =1;
		while (n>=r) {
			int j=1;
			int temp = 'A'+r-1;
			while (j<=r) {
				System.out.print((char)temp);
				j++;
				temp++;
			}
			System.out.println();
			r++;
		}
		
	}

}
