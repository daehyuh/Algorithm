package 백준802;

import java.util.Scanner;

public class B18301 {

	public static void main(String[] args) {
		// N := ⌊(n 1 + 1)(n 2 + 1)/(n 12 + 1) - 1⌋
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		System.out.println((n1 + 1) * (n2 + 1) / (n3 + 1) - 1);

	}

}
