package 백준802;

import java.util.Scanner;

public class B3733 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(s / (n + 1));
		}

	}

}
