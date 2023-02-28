package 백준728;

import java.util.Scanner;

public class B11689_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long result = n;

		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				result = result - result / i; // i - (i / i)
				while (n % i == 0) { // 2의 7제곱 * 11이라면 11만 남김
					n /= i;	// 계속 나눠준다
				}
			}
		}
		
		// 반복이 끝난뒤 1보다크면 마지막 숫자이다
		if (n > 1) {
			result = result - result / n;
		}

		System.out.println(result);

	}
}
