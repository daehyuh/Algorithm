package 백준726;

import java.util.Scanner;

public class B2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(gcd(a, b));

		System.out.println(a * b / gcd(a, b));

	}

	static int gcd(int a, int b) {

		while (b != 0) {
			int r = a % b; // 나머지를 구해준다.

			// GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;
			b = r;
		}
		return a;
	}

}
