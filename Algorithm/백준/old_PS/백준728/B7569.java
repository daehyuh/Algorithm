package 백준728;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B7569 {
	static class tomato {
		int z;
		int y;
		int x;

		public tomato(int z, int y, int x) {
			this.z = z;
			this.y = y;
			this.x = x;
		}
	}

	static int[][][] A;
	static int M, N, H;
	static Queue<tomato> que = new LinkedList<tomato>();

	static int[] dz = { 1, -1, 0, 0, 0, 0 };
	static int[] dy = { 0, 0, 0, 0, 1, -1 };
	static int[] dx = { 0, 0, -1, 1, 0, 0 };

	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();

		A = new int[H][N][M];

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					A[i][j][j2] = sc.nextInt();
					if (A[i][j][j2] == 1) {
						que.add(new tomato(i, j, j2));
					}
				}
			}
		}
		System.out.println(BFS());


	}

	private static int BFS() {

		while (!que.isEmpty()) {
			tomato t = que.poll();
			int x = t.x;
			int y = t.y;
			int z = t.z;

			for (int i = 0; i < 6; i++) {
				int nz = z + dz[i];
				int ny = y + dy[i];
				int nx = x + dx[i];
				if (nx >= 0 && ny >= 0 && nz >= 0 && nx < M && ny < N && nz < H) {
					if (A[nz][ny][nx] == 0) {
						A[nz][ny][nx] = A[z][y][x] + 1;
						que.add(new tomato(nz, ny, nx));
					}
				}
			}
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					max = Math.max(max, A[i][j][j2]);
					if (A[i][j][j2] == 0) {
						return -1;
					}
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
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					System.out.print(A[i][j][j2] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}

}
