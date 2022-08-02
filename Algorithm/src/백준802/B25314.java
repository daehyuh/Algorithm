package 백준802;

import java.util.Scanner;

public class B25314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		a = a / 4;
		
		while (a != 1) {
			System.out.print("long ");
			a--;
		}
		if (a == 1) {			
			System.out.print("long int");
		}
		
	}

}
