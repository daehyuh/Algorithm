package 백준802;

import java.util.Scanner;

public class B21300 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int i = 0; i < 6; i++) {
			sum += sc.nextInt() * 5;
		}
		System.out.println(sum);
	}

}
