
public class TrueFalse {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = new String("JAVA");
		String s3 = new String("abcd");
		System.out.println(s1=s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
	}

}
