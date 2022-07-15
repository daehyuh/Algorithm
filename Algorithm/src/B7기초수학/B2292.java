package B7기초수학;

import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int cnt = 1;
		int first = 2;

		if (num == 1) {
			System.out.print(1);
		} else {
			while (num >= first) {
				first += cnt * 6;
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
