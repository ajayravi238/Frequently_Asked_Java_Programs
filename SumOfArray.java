// How do you get the sum of all elements in an integer array in Java?

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<num; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
