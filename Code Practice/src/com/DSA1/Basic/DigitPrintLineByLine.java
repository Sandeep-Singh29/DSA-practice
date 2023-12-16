package com.DSA1.Basic;

import java.util.Scanner;

public class DigitPrintLineByLine {

	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);
	int num =scn.nextInt();
	
	int nod =0;
	int temp =num;
	while (temp !=0) {
		temp = temp /10;
		nod++;
	}
	
	int div =(int)Math.pow(10, nod-1);
	while (div !=0) {
		int q = num  / div;
		System.out.println(q);
		num = num % div;
		div = div / 10;
		
	}
	
	}

}
