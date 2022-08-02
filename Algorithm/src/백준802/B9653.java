package 백준802;

import java.util.Scanner;

public class B9653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int people = sc.nextInt();

		for (int i = 0; i < a; i++) {
			people += sc.nextInt();
			people -= sc.nextInt();
		}
		System.out.println("비와이");
	}

}
