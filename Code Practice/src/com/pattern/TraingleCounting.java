package com.pattern;

import java.util.Scanner;

public class TraingleCounting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i =1;
		 while (n>=i) {
			int j=1;
			while (j<=i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
