package Doit720;

import java.util.Scanner;

public class B2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int start = 1;
		int end = 1;
		int sum = 1;
		int cnt = 1;
		
		while(end != n) {
			if (sum < n) {
				end++;
				sum += end;
			} else if(sum > n) {
				sum -= start;
				start++;
			} else if (sum == n) {
				end++;
				sum += end;
				cnt++;
			}
//			System.out.println("start"+start+"end"+end+"sum"+sum);
		}
		
		System.out.println(cnt);

	}

}
