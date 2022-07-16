package B8기초수학2;

import java.util.Scanner;

//수학
//정수론
//소수 판정
//에라토스테네스의 체
public class B9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int loop = sc.nextInt();

		for (int l = 0; l < loop; l++) {
			int x = sc.nextInt();
			int a = 0;
			int b = 0;

			for (int i = 0; i <= x / 2; i++) {
				if (isPrime(i) && isPrime(x - i)) {
					a = i;
					b = x - i;
				}
			}

			System.out.print(a + " ");
			System.out.println(b);
		}
	}

	public static boolean isPrime(int x) {
		if (x == 1) {
			return false;
		}

		for (int i = 2; i <= (int) Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

}
