import java.util.Scanner;

public class Starhalf {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;

		while (n>=i) {
			int j=1;
			while (i>=j) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
