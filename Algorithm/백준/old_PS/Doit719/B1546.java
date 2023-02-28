package Doit719;

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		// 구간합 구하기
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		double[] arr = new double[i];
		double max = 0;
		double sum = 0;
		double result = 0;
		int n = 0;
		
		for (int j = 0; j < i; j++) {
			arr[j] = sc.nextInt();
			if (arr[j] > max) {
				max = arr[j];
			}
			sum += arr[j];
		}

		result = sum/max*100/i;
		System.out.println(result);

	}

}
