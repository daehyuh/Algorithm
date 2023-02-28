package 백준726;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		for (int i = 0; i < l; i++) {
			Queue<String> que = new LinkedList<String>();
			String[] strArr = sc.next().split("");
			boolean status = true;
			for (int j = 0; j < strArr.length; j++) {
				if (strArr[j].equals("(")) {
					que.add("O");
				} else if(strArr[j].equals(")")) {
					if (que.isEmpty()) {
						status = false;
					} else {						
						que.poll();
					}
				}
			}
			
			if (!que.isEmpty()) {
				status = false;
			}
			
			if (status) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
