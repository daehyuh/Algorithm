package BB11정렬;

import java.util.Arrays;
import java.util.Scanner;

public class B11650 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
//		int l = Integer.parseInt(br.readLine());
		int l = sc.nextInt();
		int[][] arr = new int[l][2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		Arrays.sort(arr, (arr_1, arr_2) -> {
			
			if (arr_1[0] == arr_2[0]) {
				return arr_1[1] - arr_2[1];
			} else {
				return arr_1[0] - arr_2[0];
			}
		});

//		int swap = 0;
//		int swap2 = 0;
//		for (int i = 0; i < l; i++) {
//			for (int j = 0; j < l - 1; j++) {
//				if (arr[j][0] > arr[j + 1][0]) {
//					swap = arr[j][0];
//					swap2 = arr[j][1];
//					arr[j][0] = arr[j + 1][0];
//					arr[j][1] = arr[j + 1][1];
//					arr[j + 1][0] = swap;
//					arr[j + 1][1] = swap2;
//				}
//				if (arr[j][0] == arr[j + 1][0] && arr[j][1] > arr[j + 1][1]) {
//					swap = arr[j][0];
//					swap2 = arr[j][1];
//					arr[j][0] = arr[j + 1][0];
//					arr[j][1] = arr[j + 1][1];
//					arr[j + 1][0] = swap;
//					arr[j + 1][1] = swap2;
//				}
//
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		System.out.print(sb);

	}

}
