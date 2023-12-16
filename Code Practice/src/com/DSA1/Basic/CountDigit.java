package com.DSA1.Basic;

public class CountDigit {

	public static void main(String[] args) {

		
		int num = 1234456;
		int dig =0;
		
		while (num !=0) {
			num = num / 10;
			dig++;
		}
		
		System.out.println(dig);
	}

}
