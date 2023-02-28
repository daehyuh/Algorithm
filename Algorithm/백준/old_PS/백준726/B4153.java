package 백준726;

import java.util.Scanner;

public class B4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int a = sc.nextInt();
			a = a * a;
			int b = sc.nextInt();
			b = b * b;
			int c = sc.nextInt();
			c = c * c;

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			if (a == b + c || b == a + c || c == a + b) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}

	}

}
