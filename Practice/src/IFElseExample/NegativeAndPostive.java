package IFElseExample;

import java.util.Scanner;

public class NegativeAndPostive {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num ;
//		num = sc.nextInt();
		
		int num=5;
		
		if (num>0 && num <6) {                 
			System.out.println(num +":: Number is Postive");
		}else {
			System.out.println(num +":: Number is Negative");
		}

	}

}

/*
 * 1. || if in 2 condition one will be true then whole condition will we true 2.
 * && if in 2 condition one will be false then whole condition will we false 3.
 * ! it is reverse the condition id true then reverse into false and vice-versa
 */



