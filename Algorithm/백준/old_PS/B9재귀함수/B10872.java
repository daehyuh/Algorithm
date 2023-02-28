package B9재귀함수;
//수학
//구현
//조합론
import java.util.Scanner;

public class B10872 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(pibo(n));
	
	}
	
	public static int pibo(int n) {
		int sum = 1;
		
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		
		return sum;
	}

}
