package 백준728;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B18352_2 {
	static ArrayList<Integer>[] A;
	static int[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();

		ArrayList<Integer> answer = new ArrayList<Integer>();

		visited = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			visited[i] = -1;
		}
		
		A = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			A[a].add(b);
		}

		BFS(X);

		for (int i = 1; i < visited.length; i++) {
			if (visited[i] == K) {
				answer.add(i);
			}
		}
		
		Collections.sort(answer);
		if (answer.isEmpty()) {
			System.out.println(-1);
		} else {
			for (Integer integer : answer) {
				System.out.println(integer);
			}			
		}

	}
	
	private static void BFS(int x2) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(x2);
		visited[x2]++;

		while (!que.isEmpty()) {
			int now = que.poll();
			for (int i : A[now]) {
				if (visited[i] == -1) {
					visited[i] = visited[now] + 1;
					que.add(i);
				}
			}
		}
	}

}
