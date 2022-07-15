package B5함수;

import java.util.Scanner;

public class B1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		hansu(sc.nextInt());
		sc.close();

	}

	public static int hansu(int num) {
		int cnt = 0;
		int hun;
		int teen;
		int one;

		for (int i = 1; i <= num; i++) {

			if (i < 100) {
				cnt++;
			} else {
				hun = i / 100;
				teen = (i % 100 - i % 10) / 10;
				one = i % 10;
				if ((hun - teen) == (teen - one)) {
					cnt++;
				}
			}

		}

		System.out.println(cnt);
		return cnt;

	}

}
