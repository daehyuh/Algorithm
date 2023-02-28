package B7기초수학;

import java.util.Scanner;

public class B10250bad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H;
		int W;
		int in;
		String[][] arr;
		int cnt = 0;
		int Loop = sc.nextInt();

		for (int l = 0; l < Loop; l++) {
			H = sc.nextInt();
			W = sc.nextInt();
			in = sc.nextInt();
			arr = new String[H][W];
			cnt = 0;
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (j < 9) {
						arr[i][j] = Integer.toString(i + 1) + "0" + Integer.toString(j + 1);
					} else {
						arr[i][j] = Integer.toString(i + 1) + Integer.toString(j + 1);
					}
				}
			}
			
			for (int i = 0; i < arr[0].length; i++) {
				for (int j = 0; j < arr.length; j++) {
					cnt++;
					if (cnt == in) {
						System.out.print(arr[j][i]);
					}
				}
			}
			

		}

	}
}
