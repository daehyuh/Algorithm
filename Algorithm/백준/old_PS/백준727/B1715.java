package 백준727;

import java.util.PriorityQueue;
import java.util.Scanner;

public class B1715 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int back = 0;

		for (int i = 0; i < l; i++) {
			pq.add(sc.nextInt());
		}

		while (pq.size() != 1) {
			int a = pq.poll();
			int b = pq.poll();
			back += a + b;
			pq.add(a + b);
		}

		System.out.println(back);

	}

}
