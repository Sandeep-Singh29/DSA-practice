package com.Array;

import java.util.Arrays;

/*
input = 4,6,3,8,5,3,1   |||| output = 1,3,3,4,5,6,8 >>> int
input = b,d,a,g,e,h     |||| output = a,b,d,e,g,h  >>> string

 */

public class SortArrayAndString {

	public static void main(String[] args) {

		int [] arr = {4,6,3,8,5,3,1};
		String []strArray = {"b","d","a","g","e","h"};

		int temp = 0;    

		System.out.println("orginal string");
		for (int i = 0; i <arr.length; i++) {     
			System.out.print(arr[i] + " ");    
		}   
		System.out.println("");
		System.out.println("sort array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] >arr[j]) {     
					temp = arr[i];    
					arr[i] = arr[j];    
					arr[j] = temp;  
				}  
			}
			System.out.print(arr[i]+",");

		}
		System.out.println();
		System.out.println("using array sort method");
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));





	}

}
