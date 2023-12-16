package com.DSA1.Basic;

import java.util.Scanner;

// 10 8 check this schnerio
public class CheckNumberGreater {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a>b) {
			System.out.println("a greater");
		}else if (b>a) {
			System.out.println("b greater");
		} else {
			System.out.println("both equal");
		}
		
	}

}
