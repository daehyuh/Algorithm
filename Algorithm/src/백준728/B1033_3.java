package 백준728;

import java.util.*;

public class B1033_3 {
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
	static long B[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		A = new ArrayList[n];
		B = new long[n];
		visited = new boolean[n];
		long small = 1;

		for (int i = 0; i < n; i++) {
			A[i] = new ArrayList<c>();
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			A[a].add(new c(b, v1, v2));
			A[b].add(new c(a, v2, v1));
			small *= v1 * v2 / yaksu(v1, v2);
		
		}
		
		B[0] = small;

		DFS(0);

		long allsm = B[0];
		for (int i = 1; i < n; i++) {
			allsm = yaksu(allsm, B[i]);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(B[i] / allsm + " ");
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

	private static long yaksu(long allsm, long b2) {
		if (b2 == 0) {
			return allsm;
		} else {
			return yaksu(b2, allsm % b2);
		}
	}

}
