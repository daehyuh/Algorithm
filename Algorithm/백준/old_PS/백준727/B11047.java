package 백준727;

import java.util.Scanner;

//그리디 프로그래밍
public class B11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] <= K) {
					cnt = cnt + K / arr[i];
					K = K % arr[i];
				}
			}


		System.out.println(cnt);
	}

}
