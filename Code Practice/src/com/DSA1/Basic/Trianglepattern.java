package com.DSA1.Basic;

public class Trianglepattern {

	public static void main(String[] args) {

		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		System.out.println("----------------------------");
		
		
		System.out.println("*\n**\n***\n****\n*****\n");
		
		System.out.println("Using for loop");
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
