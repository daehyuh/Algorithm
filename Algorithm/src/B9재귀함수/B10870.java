package B9재귀함수;
//수학
//구현
//재귀
import java.util.Scanner;

public class B10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		System.out.println(fibo(n));

	}

	public static int fibo(int n) {
		
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		
		
		return fibo(n-1) + fibo(n-2);
	}

}
