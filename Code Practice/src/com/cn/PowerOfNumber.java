package com.cn;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

       Scanner s = new Scanner(System.in);
       
       System.out.println("enter x value");
       int x=s.nextInt();
       System.out.println("enter n value");
        int n =s.nextInt();
         
//        way 1
//        int power = (int) Math.pow(x, n);
//		System.out.println(power);
        
//        way2
        
//		int temp =1;
//        while(n!=0)
//        {
//            temp=temp*x;
//            n--;
//        }
//	
//	    System.out.println(temp);
        
//        way 3
        int i =0;
        int power = 1;
        while (n>i) {
			power = power*x;
			i++;
		}
        System.out.println(power);
		
	}

}
