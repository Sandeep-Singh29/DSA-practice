package com.cn;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int i= 2;
		while(i<=num-1) {
			
			if(num%i==0) {
				System.out.print(i+" ");
			}
			i++;
			
		}
		
	}

}
