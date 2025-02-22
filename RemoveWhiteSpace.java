// How do you remove spaces from a string in Java?

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = "";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				res += str.charAt(i);
			}
		}
		System.out.println(res);
	}

}
