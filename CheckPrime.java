// Java program to check if the given number is a prime number

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0 || num == 1) {
			System.out.println("Prime");
		}
		else {
			for(int i=2; i<num; i++) {
				if(num%i == 0) {
					System.out.println("Not a Prime");
					return;
				}
			}
			System.out.println("Prime");
		}
	}

}
