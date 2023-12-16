/* 
        0  1  2  3  4  index position
Input = H  e  l  l  o    
         0  1   2   3   4     Reverse the string and index is --;
Output = o	l	l	e	H
  
  Using Solve 4 Way
  
  1 using toCharArrat();
  2 Using charAt(int index);
  3 using StringBuilder reverse();
  4 using StringBuffer reverse();
  
*/
package Com.String;

public class Reverse_String {
	public static void main(String[] args) {
		
	   String name ="Sandeep";
	   
	   //Approach way-1
	   char[] chArr =name.toCharArray();
	   System.out.println("Orginal data>>   "+name);
	   
	  for(int i=chArr.length-1; i>=0;  i--) {
		  System.out.print(chArr[i]);
	  }
	  System.out.println("\n");
	  //Approach way-2
	  for (int i = chArr.length-1; i >= 0;  i--) {
		System.out.print(name.charAt(i));
	}
	  //Approach way-3
	  StringBuilder sb=new StringBuilder(name);
	  System.out.println("\n");
	  System.out.println("using StringBuilder >>  "+sb.reverse());
	  
	  //Approach way-4
	  
	  StringBuffer strb = new StringBuffer(name);
	  System.out.println("String Buffer >> "+strb.reverse());
	  
	}
}
