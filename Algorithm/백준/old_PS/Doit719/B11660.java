package Doit719;

import java.util.Scanner;

public class B11660 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int l2 = sc.nextInt();
		int[][] arr = new int[l + 1][l + 1];

		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 2; i < arr.length; i++) {
			arr[1][i] = arr[1][i] + arr[1][i - 1];
			arr[i][1] = arr[i][1] + arr[i - 1][1];
		}

		for (int i = 2; i < arr.length; i++) {
			for (int j = 2; j < arr.length; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1] + arr[i][j];
			}
		}

//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int a = 0; a < l2; a++) {
			int x1 = sc.nextInt() - 1; // 2
			int y1 = sc.nextInt() - 1; // 2
			int x2 = sc.nextInt(); // 3
			int y2 = sc.nextInt(); // 4
			int result = arr[x2][y2] - arr[x1][y2] - arr[x2][y1] + arr[x1][y1];
			System.out.println(result);
		}

	}

}
