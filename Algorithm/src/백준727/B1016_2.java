package 백준727;

import java.util.Scanner;

public class B1016_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();

		boolean[] b = new boolean[(int) ((max - min) + 1)];
		
		for (int i = 2; i * i <= max; i++) {
			long pow = i * i;
			long start = (min / pow);
			if (min % pow != 0) {
				start++;
			}
			for (long j = start; j * pow <= max; j++) {
				b[(int) ((j * pow) - min)] = true;
			}
		}

		int cnt = 0;
		for (int i = 0; i <= max - min; i++) {
			if (b[i] == false) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
