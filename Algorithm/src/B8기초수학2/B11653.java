package B8기초수학2;

//수학
//정수론
//소수 판정
import java.util.Scanner;

public class B11653 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		check(n);

	}

	public static int check(int n) {
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n /= i;
			}
		}
		return n;
	}
}
