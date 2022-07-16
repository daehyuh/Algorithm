package B8기초수학2;

//수학
//정수론
//소수 판정
//에라토스테네스의 체
import java.util.Scanner;

public class B4948 {
	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break; // n 이 0 일경우 종료

			int count = 0; // 소수 개수를 셀 변수

			for (int i = n + 1; i <= 2 * n; i++) {
				if (get_prime(i) == 1)
					count++;
			}
			System.out.println(count);
		}
	}

	// 소수를 얻는 메소드
	public static int get_prime(int n) {

		if (n == 1) {
			return 0;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return 0;
			}
		}

		return 1;
	}

}