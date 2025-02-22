// Write a Java program to print a Fibonacci sequence.

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first = 0, second = 1;
		System.out.print(first + " " + second + " ");
		
		for(int i=2; i<num; i++) {
			int sum = first + second;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		}
	}

}
