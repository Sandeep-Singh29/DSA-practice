package Com.code;

public class Remove_Comma {

	public static void main(String[] args) {

		
	String str="A,B,C,D,E,";
	String name= "AA,BB,CC,DD,EE,";
	String word= ",AAA,BBB,CCC,DDD,EEE";
	
	System.out.println("Way 1 comma in last");
		
	System.out.println(str);
	
	System.out.println("Way 2 comma in last");
	
		if (name.endsWith(",")) {
			name.substring(name.length()-1);
		}
		System.out.println(name);
		
		System.out.println("Way 3 comma in first");
//		word = word.startsWith(",") ? word.substring(1) : word;
		word = word.replaceFirst("^,", "");
		
		System.out.println(word);
		
	}

}
