package Doit721;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> que = new LinkedList<Integer>();
		int l = sc.nextInt();
		sc.close();
		for (int i = 0; i < l; i++) {
			que.add(i+1);
		}
		
		while (que.size() != 1) {
			que.poll();
			que.add(que.peek());
			que.poll();
		}
		
		System.out.println(que.peek());
	}

}
