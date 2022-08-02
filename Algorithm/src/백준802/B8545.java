package 백준802;

import java.util.Scanner;

public class B8545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = sc.next().split("");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
