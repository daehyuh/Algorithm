package 백준726;

import java.util.Arrays;
import java.util.Scanner;

public class B1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			int n = sc.nextInt();
			System.out.println(binarySearch(arr, n));
		}

	}

	public static int binarySearch(int[] arr, int n) {
		int lo = 0; // 탐색 범위의 왼쪽 끝 인덱스
		int hi = arr.length - 1; // 탐색 범위의 오른쪽 끝 인덱스

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (n < arr[mid]) {
				hi = mid - 1;
			}
			// key값이 중간 위치의 값보다 클 경우
			else if (n > arr[mid]) {
				lo = mid + 1;
			}
			// key값과 중간 위치의 값이 같을 경우
			else {
				return 1;
			}
		}

		return 0;
	}

}
