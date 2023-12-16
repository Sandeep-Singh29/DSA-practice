package IFElseExample;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a , b , c;
		
		System.out.println("Enter a number");
		
		System.out.println("Enter a");
		a= sc.nextInt();
		System.out.println("Enter b");
		b= sc.nextInt();
		System.out.println("Enter c");
		c =sc.nextInt();
			
		if (a>b && a>c) {
			System.out.println("A num is Greater");
		}else if (b>a && b >c) {
			System.out.println("B num is Greater");
		}else {
			System.out.println("C num is Greater");
		}
		
	}

}
