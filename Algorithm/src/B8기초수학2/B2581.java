package B8기초수학2;
//수학
//정수론
//소수 판정

import java.util.Scanner;

public class B2581 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		int min = 0;
		for (int i = a; i < b+1; i++) {
			if (check(i) != 0) {
				min = i;
				sum = 0;
				for (int j = a; j < b+1; j++) {
					sum += check(j);
				}
				break;
			} else {
				sum = -1;
			}
		}
		
		if (sum == -1) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

	public static int check(int n) {

		if (n == 1) {
			return 0;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		
		return n;
	}

}
