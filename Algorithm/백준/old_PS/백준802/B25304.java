package 백준802;

import java.util.Scanner;

public class B25304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			a = a * sc.nextInt();
			m -= a;
		}
		
		if (m == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
