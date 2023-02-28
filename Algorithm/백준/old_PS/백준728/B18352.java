package 백준728;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class B18352 {
	static int visited[];
	static ArrayList<Integer>[] A;
	static Stack<Integer> stack = new Stack<Integer>();
	static int N, M, K, X;
	static List<Integer> answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		X = sc.nextInt();

		A = new ArrayList[N + 1];
		answer = new ArrayList<>();

		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			A[a].add(b);
		}

		visited = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			visited[i] = -1;
		}
		
		BFS(X);

		for (int i = 0; i <= N; i++) {
			if (visited[i] == K) {
				answer.add(i);
			}
		}
		
		if (answer.isEmpty()) {
			System.out.println(-1);
		} else {
			Collections.sort(answer);
			for (int i : answer) {
				System.out.println(i);
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
