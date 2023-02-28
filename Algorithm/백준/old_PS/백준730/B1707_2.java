package 백준730;

import java.util.ArrayList;
import java.util.Scanner;

public class B1707_2 {
	static int K, V, E;
	static ArrayList<Integer>[] A;
	static boolean visited[];
	static int check[];
	static boolean Status;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();

		for (int i = 0; i < K; i++) {
			V = sc.nextInt();
			E = sc.nextInt();
			A = new ArrayList[V + 1];
			visited = new boolean[V + 1];
			check = new int[V + 1];

			for (int j = 1; j < V + 1; j++) {
				A[j] = new ArrayList<Integer>();
			}

			for (int j = 0; j < E; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				A[a].add(b);
				A[b].add(a);
			}
			Status = true;
			for (int j = 1; j <= V; j++) {
				if (Status) {
					DFS(j);
				} else {
					break;
				}
			}

			if (Status) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}

	static void DFS(int n) {
		visited[n] = true;
		
		for (int a : A[n]) {
			if (!visited[a]) {
				visited[a] = true;
				check[a] = (check[n] + 1) % 2;
				DFS(a);
			} else if (check[a] == check[n]) {
				Status = false;
				return;
			}
		}

	}

}
