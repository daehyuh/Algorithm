package 백준726;

import java.util.Scanner;

public class B2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			sum += n * n;
		}
		
		System.out.println(sum%10);
	}

}
