package Doit721;

import java.util.Scanner;
import java.util.Stack;

public class B1874 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		int n = sc.nextInt();
		int[] arr = new int[n];
		int num = 1;
		for (int j = 0; j < arr.length; j++) {
			arr[j] = sc.nextInt();
		}

		boolean result = true;

		for (int j = 0; j < n; j++) {
			int su = arr[j];
				
			if (su >= num) {
				while (su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int p = stack.pop();
				if (p > su) {
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
