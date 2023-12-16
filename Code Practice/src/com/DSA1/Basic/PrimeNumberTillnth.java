package com.DSA1.Basic;

public class PrimeNumberTillnth {

	public static void main(String[] args) {

		int low =6;
		int high = 100;
		
		for (int num = low; num <=high; num++) {
			int count =0;
			for (int div = 2; div * div <=high ;div++) {
				if (num % div ==0) {
					count++;
					break;
				}
			}if (count==0) {
				System.out.println(num +"   >>PRIME");
			}else {
				System.out.println(num +"   >>Not Prime");
			}
			
		}
		
	}

}
