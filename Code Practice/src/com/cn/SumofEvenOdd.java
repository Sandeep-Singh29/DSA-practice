package com.cn;

import java.util.Scanner;

public class SumofEvenOdd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum_o =0;
        int sum_e =0;
        int rem = 0;
        int temp =0;
        int i =0;
        
        while(num >=i){
            i=0;
            rem = num/10;
            temp = num%10;
            num =rem;
            
            
            if(temp%2==0){
            	sum_e = sum_e+temp;
//                System.out.println(sum_e);

            }else {
                sum_o = sum_o+temp;
//                System.out.println(sum_o);
            }
            
            i++;
            
        }
        System.out.println(sum_e+" "+sum_o);
		
	}

}
