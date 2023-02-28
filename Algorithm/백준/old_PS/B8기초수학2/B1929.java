package B8기초수학2;

//에라토스테네스의 체**
import java.util.Scanner;

public class B1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			isPrime(i);
		}

	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int j = 2; j <= (int) Math.sqrt(n); j++) {
			if (n % j == 0) {
				return false;
			}
		}
		System.out.println(n);
		return true;
	}

}
