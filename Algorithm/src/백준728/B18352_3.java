package 백준728;

import java.util.*;
//그래프 이론
//그래프 탐색
//너비 우선 탐색
//데이크스트라
public class B18352_3 {
	static ArrayList<Integer>[] A;
	static int visited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		A = new ArrayList[N + 1];
		visited = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			A[i] = new ArrayList<Integer>();
		}

		for (int i = 1; i < N + 1; i++) {
			visited[i] = -1;
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			A[a].add(b);
		}

		BFS(X);
		
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == K) {
				answer.add(i);
			}
		}
		
		Collections.sort(answer);
		
		if (answer.isEmpty()) {
			System.out.println(-1);
		} else {
			for (int i : answer) {
				System.out.println(i);
			}
		}

	}

	public static void BFS(int x) {
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(x);
		visited[x]++;

		while (!que.isEmpty()) {
			int next = que.poll();
			for (Integer i : A[next]) {
				if (visited[i] == -1) {
					visited[i] = visited[next] + 1;
					que.add(i);
				}
			}
		}
	}

}
