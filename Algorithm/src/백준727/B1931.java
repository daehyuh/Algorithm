package 백준727;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();

		int[][] A = new int[l][2];

		for (int i = 0; i < A.length; i++) {
			A[i][0] = sc.nextInt();
			A[i][1] = sc.nextInt();
		}

		Arrays.sort(A, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});

		int cnt = 0;
		int end = -1;

		for (int i = 0; i < A.length; i++) {
			if (end <= A[i][0]) {
				end = A[i][1];
				cnt++;
			}
		}

		System.out.println(cnt);

	}

}
