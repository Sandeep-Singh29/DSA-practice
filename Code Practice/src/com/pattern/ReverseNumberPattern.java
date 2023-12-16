package com.pattern;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r=1;
        char alpha =65;
        
        while(n>=r){
            int j=1;
            
            while(r>=j){
                System.out.print(alpha);
                j++;
                
            }
            System.out.println();
            alpha++;
			r++;
        }
		
	}

}
