package BB11정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < l; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for (Integer integer : list) {
			sb.append(integer+"\n");
		}

		System.out.println(sb);
		
	}
	
}
