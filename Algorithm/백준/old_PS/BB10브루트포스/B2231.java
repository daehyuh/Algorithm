package BB10브루트포스;

import java.util.Scanner;

public class B2231 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int status = 0;
		
		for (int i = 0; i < n; i++) {
			int num = i;
			int sum = 0;
			sum = sum + num;
			while (true) {
				sum = sum + (num % 10);
				num /= 10;
				if ((num == 0)) {
					break;
				}
			}
			if (sum == n) {
				System.out.println(i);
				status = 1;
				break;
			}
		}
		
		if(status == 0) {
			System.out.println(0);
		}
	}

}
