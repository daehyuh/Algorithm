package 백준727;

import java.util.Scanner;

public class B1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		boolean[] A = new boolean[(int) (max - min) + 1];

		for (int i = 2; i <= max; i++) {
			long pow = i * i;
			long startindex = min / pow;

			if (min % pow != 0)
				startindex++; // 나

			for (long j = startindex; pow * j <= max; j++) {
				A[(int) ((j * pow) - min)] = true;
			}

		}
		
		int count = 0;
		for (int i = 0; i <= max - min; i++) {
			if (!A[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
