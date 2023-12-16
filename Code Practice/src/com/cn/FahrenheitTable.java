package com.cn;

import java.util.Scanner;

public class FahrenheitTable {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
        int s =scn.nextInt();
        int e=scn.nextInt();
        int w =scn.nextInt();
		int fah;        
        
       while(s<=e){
           fah=((5*(s-32))/9);
           System.out.println(s+"	"+fah);
		   s+=w;
       }
		
	}

}
