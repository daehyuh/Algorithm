package B6문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();

		String[] strArr = str.split("");

		int[] arr = new int[26];

		Map<String, Integer> myMap = new HashMap<String, Integer>();

		for (int i = 0; i < strArr.length; i++) {
			arr[(int) strArr[i].charAt(0) - 65]++;
		}

		int max = 0;
		char maxStr = 0;
		int maxcnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				if (max <= arr[i]) {
					max = arr[i];
					maxStr = (char) (i + 65);
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				maxcnt++;
			}
		}

		if (maxcnt >= 2) {
			System.out.print("?");
		} else {
			System.out.print(maxStr);
		}

	}

}
