package Doit720;

import java.util.Arrays;
import java.util.Scanner;

public class B1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		
		int start = 0;
		int end = n-1;
		int cnt = 0;
		
		while (start < end) {
			if (arr[start]+arr[end] == a) {
				end--;
				start++;
				cnt++;
			} else if (arr[start]+arr[end] < a) {
				start++;
			} else if (arr[start]+arr[end] > a) {
				end--;
			}
		}
		
		System.out.println(cnt);
	}

}
