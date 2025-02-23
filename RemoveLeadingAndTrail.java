// How do you remove leading and trailing spaces from a string in Java?

import java.util.Scanner;

public class RemoveLeadingAndTrail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.length());
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(0) == ' ') {
				sb.deleteCharAt(0);
			}
			if(sb.charAt(sb.length()-1) == ' ') {
				sb.deleteCharAt(sb.length()-1);
			}
		}
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
