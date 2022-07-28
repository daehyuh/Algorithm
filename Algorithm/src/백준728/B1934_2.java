package 백준728;

import java.util.Scanner;

public class B1934_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		for (int i = 0; i < l; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a * b / sm(a, b);
			System.out.println(result);
		}
	}

	private static int sm(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return sm(b, a % b);
		}

	}

}
