package week1.day2_assignments;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
		System.out.println();
		int i = 1;
		while (i < arr.length) {
			if (arr[i] - arr[i - 1] != 1) {
				System.out.println("Missing number is " + (arr[i - 1] + 1));
			}
			i++;
		}
	}
}