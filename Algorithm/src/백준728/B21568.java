package 백준728;

import java.util.Scanner;

public class B21568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int gcd = gcd(a, b);
		if (c % gcd != 0) {
			System.out.println(-1);
		} else {

			int mok = (int) (c / gcd);
			long[] ret = Excute(a, b);
			System.out.println(ret[0] * mok + " " + ret[1] * mok);
		}

	}
	
	
	
	private static long[] Excute(int a, int b) {
		long[] ret = new long[2];
		if (b == 0) {
			ret[0] = 1;
			ret[1] = 0;
			return ret;
		}
		long q = a / b;
		long[] v = Excute(b, a % b);
		ret[0] = v[1];
		ret[1] = v[0] - v[1] * q;

		return ret;
	}

	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}
