package 백준728;

import java.util.Scanner;

public class B1934 {

	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();

		int big = a >= b ? a : b;
		int small = a < b ? a : b;
		int mod;
		while (true) {
			mod = big % small;
			big = small;
			small = mod;

			if (mod == 0) {
				break;
			}
		}

		System.out.println(big);
		System.out.println(a * b / big);

	}

}
