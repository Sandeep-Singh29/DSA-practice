package com.cn;

import java.util.Scanner;

//avg of 3 10+20+30 is 60 and >> 60/3=20

public class Averageof3 {

	public static void main(String[] args) {

		   Scanner s=new Scanner (System.in);
		    int n=s.nextInt();
		    boolean isprime=true;
		    if(n%2==0)
		        isprime=false;
		    int i=3;
		    while(isprime&&i<n){
		        isprime=!(n%i==0);
		        i+=2;
		    }if(isprime){
		        System.out.println("Prime");
		    }else{
		        System.out.println("Composite");
		    }
		
		
	}

}
