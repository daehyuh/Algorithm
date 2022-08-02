package 백준802;

import java.util.Scanner;

public class B4999 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		String d = sc.next();
		
		if (b.contains(d)) {
			System.out.println("go");
		}else {
			System.out.println("no");
		}
		

	}

}
