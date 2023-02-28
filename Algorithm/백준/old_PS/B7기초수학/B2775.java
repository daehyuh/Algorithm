package B7기초수학;

import java.util.Scanner;

public class B2775 {

	public static void main(String[] args) {

		int[][] arr = new int[15][15];

		for (int i = 0; i < arr.length; i++) {
			arr[0][i] = i;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
				}

			}
		}

		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for (int l = 0; l < loop; l++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(arr[a][b]);
//				 for (int i = 0; i < arr.length; i++) {
//					for (int j = 0; j < arr[i].length; j++) {
//						System.out.print(arr[i][j] + " ");
//					}
//					System.out.println();
//				}
		}

	}

}
