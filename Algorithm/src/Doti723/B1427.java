package Doti723;

import java.util.Scanner;

public class B1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = sc.next().split("");

		for (int i = 0; i < arr.length; i++) {
			int max = i;
			String swap = "";
			for (int j = i; j < arr.length; j++) {
				if (Integer.parseInt(arr[max]) < Integer.parseInt(arr[j])) {
					max = j;
				}
			}
			swap = arr[i];
			arr[i] = arr[max];
			arr[max] = swap;

		}
		for (String string : arr) {
			System.out.print(string);
		}

	}

}
