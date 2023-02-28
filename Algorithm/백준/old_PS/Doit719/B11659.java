package Doit719;

import java.io.InputStreamReader;
import java.util.Scanner;
// 구간합1
public class B11659 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int l = sc.nextInt();
		int l2 = sc.nextInt();
		int[] arr = new int[l + 1];

		for (int i = 1; i < l + 1; i++) {
			arr[i] += arr[i - 1] + sc.nextInt();
		}
		
		for (int i = 0; i < l2; i++) {
			int a = arr[sc.nextInt() - 1];
			int b = arr[sc.nextInt()];
			System.out.println(b - a);
		}

	}

}
