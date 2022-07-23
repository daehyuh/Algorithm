package Doti723;

import java.util.Arrays;
import java.util.Scanner;

public class B11004 {

	public static void Quicksort(int[] arr) {

		Quicksort(arr, 0, arr.length - 1);

	}

	public static void Quicksort(int arr[], int start, int end) {
		int sort2 = partition(arr, start, end);

		if (start < sort2 - 1) {
			Quicksort(arr, start, sort2 - 1);
		}
		if (sort2 < end) {
			Quicksort(arr, start, end);
		}

	}

	public static int partition(int[] arr, int start, int end) {
		int center = arr[(start + end) / 2];

		while (start <= end) {

			while (arr[start] < center) {
				start++;
			}
			while (arr[end] > center) {
				end--;
			}

			if (start <= end) {
				int swap = arr[start];
				arr[start] = arr[end];
				arr[end] = swap;
				start++;
				end--;
			}

		}

		return start;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int k = sc.nextInt() - 1;
		
		int[] arr = new int[l];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

//		quickSort(arr);
		Arrays.sort(arr);

		System.out.println(arr[k]);

	}

}
