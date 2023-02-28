package 백준802;

import java.util.Scanner;

public class B86383 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum1 = 0;
		sum1 += sc.nextInt() * 6;
		sum1 += sc.nextInt() * 3;
		sum1 += sc.nextInt() * 2;
		sum1 += sc.nextInt() * 1;
		sum1 += sc.nextInt() * 2;
		int sum2 = 0;
		sum2 += sc.nextInt() * 6;
		sum2 += sc.nextInt() * 3;
		sum2 += sc.nextInt() * 2;
		sum2 += sc.nextInt() * 1;
		sum2 += sc.nextInt() * 2;
		System.out.println(sum1 + " " + sum2);

	}

}
