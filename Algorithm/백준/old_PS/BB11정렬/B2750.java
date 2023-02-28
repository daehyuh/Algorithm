package BB11정렬;
//구현
//정렬

import java.util.Scanner;

public class B2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}


//		Arrays.sort(arr);
	 	sortArr(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] sortArr(int[] arr) {
		int swap;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}

		return arr;
	}

}
