package week1.day2_assignments;

import java.util.Arrays;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };
		Arrays.sort(arr);
		int[] array = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if ((arr[i]) == arr[j]) {
					array[j] = visited;
					count++;
				}
			}
			if (array[i] != visited) {
				array[i] = count;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] != visited) {
				
				System.out.println(arr[i] + " occured " + array[i] + " times");
			}
		}
	}
}