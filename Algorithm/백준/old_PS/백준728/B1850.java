package 백준728;

import java.util.Scanner;

public class B1850 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		long a = sc.nextLong();
		long b = sc.nextLong();
		long result = gcr(a, b);
		
		for (int i = 0; i < result; i++) {
			sb.append(1);
		}
		System.out.println(sb);
	}
	
	static long gcr(long nextInt, long nextInt2) {
		if (nextInt2 == 0) {
			return nextInt;
		} else {
			return gcr(nextInt2, nextInt % nextInt2);
		}

	}

}
