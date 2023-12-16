package com.pattern;

import java.util.Scanner;

public class TriangeCount1_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r=1;
		
		int p =1;
		while (n>=r) {
			int j=1;
			while (j<=r) {
				System.out.print(p+" ");
				j++;
				p++;
			}
			System.out.println();
			r++;
		}
		
	}

}
