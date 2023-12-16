/*
Input :: i.like.this.program.very.much
Output :: much.very.program.this.like.i

*/
package code.GFG;

public class Reverse_String_Word {

	public static void main(String[] args) {

		String word ="i.like.this.program.very.much";
		System.out.println("Orginal Word_String  :: "+word);
		
		
		       String[] arr = word.split("\\.");
		       StringBuilder builder = new StringBuilder();
		       
		       for(int i = arr.length-1; i>=0; i--){
		           builder.append(arr[i]);
		           if(i>0) {
		            builder.append(".");
		           }
		       }
		       System.out.println("Reverse word String :: "+builder);
	}

}