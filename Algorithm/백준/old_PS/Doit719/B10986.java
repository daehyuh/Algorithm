package Doit719;

import java.util.Scanner;

public class B10986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        int[] count = new int[M];
        
        for (int i = 0; i < N; i++) {
            sum = (sum + sc.nextInt()) % M;
            count[sum]++;
        }
        
        for (int i = 0; i < count.length; i++) {
			System.err.println(count[i]);
		}
        
        long ans = count[0];
        for (int i = 0; i < M; i++) {
            ans += (long) count[i] * (count[i] - 1) / 2;
        }
        
        System.out.println(ans);

	}

}
