package 백준730;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2251 {
	static ArrayList<AB>[] A;
	static int[] send = { 0, 0, 1, 1, 2, 2 };
	static int[] recive = { 1, 2, 0, 2, 0, 1 };
	static boolean[][] visited;
	static boolean[] answer;
	static int[] now;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		now = new int[3];

		now[0] = sc.nextInt();
		now[1] = sc.nextInt();
		now[2] = sc.nextInt();

		visited = new boolean[201][201];
		answer = new boolean[201];

		BFS();

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == true) {
				System.out.print(i + " ");
			}
		}

	}

	private static void BFS() {
		Queue<AB> que = new LinkedList<>();
		que.add(new AB(0, 0));
		visited[0][0] = true;
		answer[now[2]] = true;

		while (!que.isEmpty()) {
			AB ab = que.poll();
			int a = ab.A;
			int b = ab.B;
			int c = now[2] - a - b;

			for (int i = 0; i < 6; i++) {
				int next[] = { a, b, c };
				next[recive[i]] += next[send[i]];
				next[send[i]] = 0;

				if (next[recive[i]] > now[recive[i]]) {
					next[send[i]] = next[recive[i]] - now[recive[i]];
					next[recive[i]] = now[recive[i]];
				}
				
				if (!visited[next[0]][next[1]]) {
					visited[next[0]][next[1]] = true;
					que.add(new AB(next[0], next[1]));
					if (next[0] == 0) {
						answer[next[2]] = true;
					}

				}

			}
		}

	}

	static class AB {
		int A;
		int B;

		public AB(int A, int B) {
			this.A = A;
			this.B = B;
		}

	}

}
