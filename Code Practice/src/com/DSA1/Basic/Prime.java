package com.DSA1.Basic;

import java.util.Scanner;

public class Prime {
	

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a total number");
		int t = scn.nextInt();
	
		
//		this code logic is time limited exceedeed
	/*
		for (int i = 0; i <=t; i++) {
			int n = scn.nextInt();
			int count=0;
			for (int div = 1; div <=n; div++) {
				if (n%div==0) {
					count++;
				}
			}
			if (count==2) {
				System.out.println("number is prime");
			}else {
				System.out.println("number not prime");
			}
		}
		*/
		
//		if no is divid to the no. of square root mean 36 is 6*6 square root 
//		code always run min of 1 sec than no time limit exceed  mean 1^9;
		
//		This code some time time limite exceed bcz they check all the no. and itrate and divide the given number
		/*
		for (int i = 0; i <=t; i++) {
			int n = scn.nextInt();
			int count = 0;
			for (int div = 2; div * div <=n; div++) {
				if (n%div==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
		}
		*/
//		if number is divide one time then number is not prime and break the loop
		for (int i = 0; i <=t; i++) {
			int n = scn.nextInt();
			int count = 0;
			for (int div = 2; div * div <=n; div++) {
				if (n%div==0) {
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
		}
		
		
		}
}
