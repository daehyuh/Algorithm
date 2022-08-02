package 백준802;

import java.util.Scanner;

public class B24568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = (a * 8 + b * 3) - 28;
		System.out.println(result);
	}

}
