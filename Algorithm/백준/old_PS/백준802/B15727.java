package 백준802;

import java.util.Scanner;

public class B15727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		if (length % 5 == 0) {
			System.out.println(length / 5);
		} else {
			System.out.println(length / 5 + 1);
		}

	}

}
