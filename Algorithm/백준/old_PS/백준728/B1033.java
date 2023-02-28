package 백준728;

import java.util.ArrayList;
import java.util.Scanner;

public class B1033 {
	static ArrayList<c>[] A;
	static boolean[] visited;
	static long[] D;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		A = new ArrayList[l];
		visited = new boolean[l];
		D = new long[l];
		long sm = 1;

		for (int i = 0; i < l; i++) {
			A[i] = new ArrayList<c>();
		}

		for (int i = 0; i < l - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			A[a].add(new c(b, v1, v2));
			A[b].add(new c(a, v2, v1));
			sm *= v1 * v2 / gcd(v1, v2);
		}

		D[0] = sm;

		DFS(0);

		long mgcd = D[0];
		for (int i = 1; i < l; i++) {
			mgcd = gcd(mgcd, D[i]);
		}

		for (int i = 0; i < l; i++) {
			System.out.print(D[i] / mgcd + " ");
		}
	}

	private static void DFS(int i) {
		visited[i] = true;
		for (c a : A[i]) {
			int next = a.getNode();
			if (!visited[next]) {
				D[next] = D[i] * a.getV2() / a.getV1();
				DFS(next);
			}
		}

	}

	static long gcd(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	static class c {
		int node;
		int v1;
		int v2;

		public c(int node, int v1, int v2) {
			super();
			this.node = node;
			this.v1 = v1;
			this.v2 = v2;
		}

		public int getNode() {
			return node;
		}

		public int getV1() {
			return v1;
		}

		public int getV2() {
			return v2;
		}
	}

}
