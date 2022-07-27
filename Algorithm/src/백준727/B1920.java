package 백준727;

import java.util.Arrays;
import java.util.Scanner;

public class B1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//
		int l = sc.nextInt();
		int[] arr = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		l = sc.nextInt();
		for (int i = 0; i < l; i++) {
			int n = sc.nextInt();
			int start = 0;
			int end = arr.length - 1;
			boolean status = false;
			while (start <= end) {
				int center = arr[(start + end) / 2];
				if (n > center) {
					start = (start + end) / 2 + 1;
				} else if (n < center) {
					end = (start + end) / 2 - 1;
				} else {
					status = true;
					break;
				}
			}

			if (status) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}

	}

}
