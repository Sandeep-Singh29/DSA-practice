package com.DSA1.Basic;

import java.util.Scanner;

public class FibnacciNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scn.nextInt(); 
		
		int first=0;
		int second=1;
		int temp =0;
		
		for (int i = 0; i <=num; i++) {
			System.out.println(first);
			temp = first+second;
			first = second;
			second = temp;
		}
		
		
	}

}
