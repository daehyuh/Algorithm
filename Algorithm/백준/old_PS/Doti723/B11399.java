package Doti723;

import java.util.Scanner;

public class B11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		int[] arr = new int[l];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > a) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = a;
		}

		int sum = 0;

		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}

		for (int i : arr) {
			sum += i;
		}

		System.out.println(sum);

	}

}
