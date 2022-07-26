package 백준726;

import java.util.Scanner;

public class B2738 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[sc.nextInt()][sc.nextInt()];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr[j].length; j2++) {
					arr[j][j2] += sc.nextInt();
				}
			}
		}
		
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = 0; j2 < arr[j].length; j2++) {
				System.out.print(arr[j][j2]+" ");
			}
			System.out.println();
		}

	}

}
