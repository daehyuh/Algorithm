package 백준728;

import java.util.ArrayList;
import java.util.Scanner;

public class B1033_2 {

	static class c {
		int node;
		int v1;
		int v2;

		public c(int node, int v1, int v2) {
			this.node = node;
			this.v1 = v1;
			this.v2 = v2;
		}
	}

	static ArrayList<c>[] A;
	static boolean visited[];
	static long[] B;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		A = new ArrayList[l];
		visited = new boolean[l];
		B = new long[l];

		for (int i = 0; i < l; i++) {
			A[i] = new ArrayList<c>();
		}

		long sm = 1;

		for (int i = 0; i < l - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			A[a].add(new c(b, v1, v2));
			A[b].add(new c(a, v2, v1));
			sm *= v1 * v2 / gcd(v1, v2);
		}
		
		B[0] = sm;
		
		DFS(0);

		long smst = B[0];
		
		for (int i = 1; i < l; i++) {
			smst = gcd(smst, B[i]);
		}
		
		for (int i = 0; i < l; i++) {
			System.out.print(B[i] / smst + " ");
		}

	}

	private static void DFS(int i) {
		visited[i] = true;
		for (c a : A[i]) {
			int next = a.node;
			if (!visited[next]) {
				B[next] = B[i] * a.v2 / a.v1;
				DFS(next);
			}
		}

	}
	
	private static long gcd(long a2, long b2) {
		if (b2 == 0) {
			return a2;
		} else {

			return gcd(b2, a2 % b2);
		}
	}

}
