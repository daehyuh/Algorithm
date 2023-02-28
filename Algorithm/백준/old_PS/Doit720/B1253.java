package Doit720;
//자료 구조
//정렬
//이분 탐색
//해시를 사용한 집합과 맵
//두 포인터
import java.util.Arrays;
import java.util.Scanner;

public class B1253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] arr = new long[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}

		Arrays.sort(arr);

		int cnt = 0;
		
		for (int k = 0; k < n; k++) {
			long find = arr[k];
			int i = 0;
			int j = n - 1;
			while (i < j) {
				if (arr[i] + arr[j] == find) {
					if (i != k && j != k) {
//						System.out.println(arr[i] + " " + arr[j] + " " + arr[i]);
						cnt++;
						break;
					} else if (i == k) {
						i--;
					} else if (j == k) {
						j++;
					}
				} else if (arr[i] + arr[j] < find) {
					i++;
				} else {
					j--;
				}
			}
		}

		System.out.println(cnt);

	}

}
