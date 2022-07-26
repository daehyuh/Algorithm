package 백준726;

import java.util.Scanner;

public class B9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		for (int i = 0; i < l; i++) {
			String str = sc.next();
			System.out.println(str.substring(0, 1)+str.substring(str.length()-1));
		}

	}

}
