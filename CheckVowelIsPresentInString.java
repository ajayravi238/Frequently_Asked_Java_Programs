// Java program to check if a vowel is present in a string

import java.util.Scanner;

public class CheckVowelIsPresentInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str = s.toLowerCase();
		
		int flag = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || 
					str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				flag = 1;
			}
		}
		if(flag == 1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

}
