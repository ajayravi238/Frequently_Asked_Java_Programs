// How do you sort an array in Java?

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
