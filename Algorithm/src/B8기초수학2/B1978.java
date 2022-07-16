package B8기초수학2;
//수학
//정수론
//소수 판정
//에라토스테네스의 체
import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int cnt = 0;


		for (int i = 0; i < l; i++) {
			int n = sc.nextInt();
			cnt +=check(n);
		}
		
		System.out.println(cnt);

	}
	public static int check(int n) {
		
		if (n == 1) {
			return 0;
		}
		
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
				return 0;
			} else {
				
			}
		}
		
		return 1;
	}

}
