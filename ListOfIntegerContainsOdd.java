// How do you check if a list of integers contains only odd numbers in Java?

import java.util.*;

public class ListOfIntegerContainsOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		while(sc.hasNextInt()) {
			l.add(sc.nextInt());
		}
		System.out.println(l);
		System.out.println(isOdd(l));
	}
	public static boolean isOdd(List<Integer> l) {
		for(int n : l) {
			if(n%2 == 0) {
				return false;
			}
		}
		return true;
	}
}
