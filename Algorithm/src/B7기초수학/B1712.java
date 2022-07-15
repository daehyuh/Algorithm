package B7기초수학;

import java.util.Scanner;

public class B1712 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int justMymoney = c - b;
		
		if (justMymoney <= 0) {
			System.out.println(-1);
		} else {
			if((a/justMymoney)>=0) {
				System.out.println(a/justMymoney+1);
			}
			
		}

	}

}
