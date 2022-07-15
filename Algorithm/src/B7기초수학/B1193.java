package B7기초수학;

import java.util.Scanner;

public class B1193 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int one = 1;
		int two = 1;
		int cnt = sc.nextInt();
		
		for (int i = 0; i < cnt-1; i++) {
			if ((one+two) % 2 == 0) {
				one++;
				if (two!=1) {
				two--;
				}
			} else if ((one+two) % 2 == 1) {
				if (one!=1) {
				one--;
				}
				two++;
			}
				
		}
		
		System.out.println(two+"/"+one);
		
	}

}
