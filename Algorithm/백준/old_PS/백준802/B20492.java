package 백준802;

import java.util.Scanner;

public class B20492 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		System.out.print((int) (m * 0.78) + " ");
		System.out.print(m - (int) ((m * 0.20) * 0.22));

	}

}
