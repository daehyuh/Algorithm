package 백준726;

import java.util.Scanner;

public class B10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		int sel = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (sel == arr[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
