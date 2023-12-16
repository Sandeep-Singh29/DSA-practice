package Com.code;

public class Split_Using {

	public static void main(String[] args) {

		String str ="My Name Is Sandeep Singh Kushwaha";
		
		String[] wordBreak = str.split(" ");
		
		
		//using for-Loop
//		for (int i = 0; i < wordBreak.length; i++) {
//			System.out.println("Break the parts >>  "+wordBreak[i]);
//		}
		System.out.println(">>>>Break the line<<<<<<");
		//using For-Each-Loop
		for (String str1 : wordBreak) {
			System.out.println(str1);
		}
		
		//After the break we have merge the all word in one line 
		System.out.println(">>>>>After the break we have merge the all word in one line<<<< ");
		
		String add="";
		String[] strarr=str.split(System.lineSeparator());
		
		for (String s : strarr) {
			add=add+" ,"+s;
			
		}
		System.out.println("Output >..  \t"+add);
		
	}

}
