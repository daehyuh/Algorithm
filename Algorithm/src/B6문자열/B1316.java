package B6문자열;

import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];
		int status = 0, cnt = 0, prev = -1, loop = sc.nextInt();
		String[] strArr;
		
		
		for (int l = 0; l < loop; l++) {
			strArr = sc.next().split("");
			
		for (int i = 0; i < strArr.length; i++) {
			if (prev != (int)strArr[i].charAt(0)-97) {
			arr[(int)strArr[i].charAt(0)-97]++;
			prev = (int)strArr[i].charAt(0)-97;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 2) {
				status = 1;
			}
		}
		
		if (status == 1) {
			status = 0;
		} else {
			cnt++;
		}
		
		arr = new int[26];
		prev = -1;
		
		}
		System.out.println(cnt);
		sc.close();
		
	}
	

}
