// How do you reverse a linked list in Java?

import java.util.*;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new LinkedList<>();
		while(sc.hasNextInt()) {
			l.add(sc.nextInt());
		}
		List<Integer> res = new LinkedList<>();
		for(int i=l.size()-1; i>=0; i--) {
			res.add(l.get(i));
		}
		System.out.println(res);
	}
}
