/*

Input =  JAVA CODE

OutPut = AVAJ EDOC

Approach>>
1st we have split the word for space.
2nd then we have reverse the sepearte word. same as reverse string
*/
package Com.String;

public class Reverse_Each_Word {

	public static void main(String[] args) {

        String str ="Sandeep Singh Kushwaha  ";
        System.out.println("orginal str ::  "+str);
        String output="";
		String revWord="";
		
//        String rep = str.replace(" ", ",");
//        System.out.println(rep);
//        rep.substring(0,rep.length()-1);
//        System.out.println(rep.substring(0,rep.length()-1));
        
		String[] wordBreak = str.split(" ");
		
		//word store seprate words & wordBreak store all word String
		for (String word : wordBreak) {  
			for (int i = word.length()-1; i>=0; i--) {
				revWord=revWord+word.charAt(i);
			}
			output= output+revWord;
		}
		System.out.println(revWord);
	}

}
