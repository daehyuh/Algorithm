package 백준727;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Collections;

public class B1744 {

	public static void main(String[] args) {
		// 양수 PQ 오름차순 collections.reverseOrder();
		// 음수 PQ 내림차순
		// one
		// zero
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>();
		int zero = 0;
		int one = 0;
		int sum = 0;
		int l = sc.nextInt();
		for (int i = 0; i < l; i++) {

			int n = sc.nextInt();

			if (n > 1) {
				plus.add(n);
			}
			if (n < 0) {
				minus.add(n);
			}
			if (n == 0) {
				zero++;
			}
			if (n == 1) {
				one++;
			}

		}
		// 1 처리
		sum += one;
		// 양수 처리
		while (plus.size() > 0) {
			if (plus.size() == 1) {
				sum += plus.poll();
				break;
			} else {
				sum += plus.poll() * plus.poll();
			}
		}
		//음수 처리
		while (minus.size() != 0) {
			if (minus.size() == 1) {
				if (zero == 0) {
					sum += minus.poll();
					zero--;
				}
				break;
			} else {
				sum += minus.poll() * minus.poll();
			}
		}
		
		System.out.println(sum);
		
	}

}
