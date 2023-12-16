package com.cn;

import java.util.Scanner;

public class SumOfNNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int i =1;
		int sum=0;
		
		while (i<=n) {
			sum = sum+i;
			i++;
		}
		System.out.println(sum+" is the sum of "+n+" Natural Number");
		
		System.out.println("-----------------------------------------------");
		
		   int a = 10;
		    while(a > 5) {
		        int b = 1;
		        System.out.print(b + " ");
		        a--;
		    }
		
		
	}

}
