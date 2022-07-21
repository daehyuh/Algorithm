package Doit721;

import java.util.Scanner;
import java.util.Stack;

public class B17298 {

	public static void main(String[] args) {
		// Scanner, 수열의크기 L, 수열 arr[], 스택 stack, 오큰수를 저장하는 OKS[],
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] arr = new int[l];
		int[] OKS = new int[l];
		Stack<Integer> stack = new Stack<Integer>();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (!stack.isEmpty()) {
				while (!stack.empty() && arr[stack.peek()] < arr[i]) {
					int p = stack.pop();
					OKS[p] = arr[i];
				}
				stack.push(i);
			} else {
				stack.push(i);
			}

		}

		for (int i = 0; i < OKS.length; i++) {
			if (OKS[i] == 0) {
				OKS[i] = -1;
			}
		}

		for (int i : OKS) {
			sb.append(i + " ");
		}

		System.out.println(sb);
		sc.close();
	}

}
