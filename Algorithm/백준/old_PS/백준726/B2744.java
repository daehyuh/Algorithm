package 백준726;

import java.util.Scanner;

public class B2744 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			int tmp = (int) str.charAt(i);

			if (tmp <= 90 && 65 <= tmp) {
				System.out.print((char) (tmp + 32));
			} else {
				System.out.print((char) (tmp - 32));
			}

		}

	}

}
