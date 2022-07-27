package 백준727;

import java.util.Scanner;

public class B1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[M + 1];

		for (int i = 0; i < M; i++) {
			arr[i] = i;
		}

		for (int i = 2; i <= Math.sqrt(M); i++) {
			if (arr[i] == 0) {
				continue;
			}
			for (int j = i + i; j <= M; j = j + i) {
				arr[j] = 0;
			}
		}
		
		for (int i = N; i <= M; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[(int)i]);
			}
		}

	}

}
