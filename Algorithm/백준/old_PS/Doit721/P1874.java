package Doit721;

import java.util.Scanner;
import java.util.Stack;

public class P1874 {

	public static void main(String[] args) {
		// 스캔, 스택, 배열의크기, 입력 배열, 카운트, 문자열 result, 출력 stringBuffer

		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int l = sc.nextInt();
		int[] arr = new int[l];
		int cnt = 1;
		boolean result = true;
		StringBuffer sb = new StringBuffer();

		// 배열 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// 스택 비교
		for (int i = 0; i < arr.length; i++) {
			int su = arr[i];

			if (cnt <= su) {
				while (cnt <= su) {
					stack.push(cnt++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int s = stack.pop();
				if (s > su) {
					System.err.println(s+" "+su);
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		
		if (result) {
			System.out.println(sb);
		}

	}

}
