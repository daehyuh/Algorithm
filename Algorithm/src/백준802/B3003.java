package 백준802;

import java.util.Scanner;

public class B3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] chess = { 1, 1, 2, 2, 2, 8 };

		for (int i = 0; i < chess.length; i++) {
			chess[i] -= sc.nextInt();
		}

		for (int i = 0; i < chess.length; i++) {
			System.out.print(chess[i] + " ");
		}
	}

}
