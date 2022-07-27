package 백준727;

import java.util.Scanner;

public class B1747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		int[] A = new int[10000001];
		
		for (int i = 2; i < A.length; i++) {
			A[i] = i;
		}

		for (int i = 2; i < Math.sqrt(A.length); i++) { // 제곱근 까지만 수행
			if (A[i] == 0) {
				continue;
			}
			for (int j = i + i; j < A.length; j = j + i) { // 배수 지우기
				A[j] = 0;
			}
		}

		int i = n;
		while (true) {
			if (A[i] != 0) {
				if (isPRDR(A[i])) {
					System.out.println(A[i]);
					break;
				}
			}
			i++;
		}

	}

	static boolean isPRDR(int n) {
		String[] st1 = Integer.toString(n).split("");
		String a = "";
		String b = "";
		for (int i = 0; i < st1.length; i++) {
			a += st1[i];
		}
		for (int i = st1.length - 1; i >= 0; i--) {
			b += st1[i];
		}
//		System.out.println(a + " ? " + b);
		if (a.equals(b)) {
//			System.out.println("true");
			return true;
		} else {
			return false;
		}

	}

}
