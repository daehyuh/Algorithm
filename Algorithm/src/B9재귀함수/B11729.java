package B9재귀함수;

import java.util.Scanner;

public class B11729 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(hanoi(n));

	}
	
	public static int hanoi(int n) {
		
		return hanoi(n)*hanoi(n) + 1;
	}

}
