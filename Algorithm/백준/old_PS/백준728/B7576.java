package 백준728;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B7576 {
	static class tomato {
		int y;
		int x;

		public tomato(int y, int x) {
			this.x = x;
			this.y = y;
		}
	}
	
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static int[][] A;
	static int M;
	static int N;
	static int status;
	static Queue<tomato> que = new LinkedList<tomato>();
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();
		A = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
				if (A[i][j] == 1) {
					que.add(new tomato(i, j));
				}
			}
		}

		System.out.println(BFS());

	}

	private static int BFS() {

		while (!que.isEmpty()) {
			tomato a = que.poll();
			int x = a.x;
			int y = a.y;

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
					if (A[ny][nx] == 0) {
						A[ny][nx] = A[y][x] + 1;
						que.add(new tomato(ny, nx));
					}
				}
			}

		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				max = Math.max(max, A[i][j]);
				if (A[i][j] == 0) {
					return -1;
				}
			}
		}

		if (max == 1) {
			return 0;
		} else {
			return max - 1;
		}

	}

	static void view() {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
