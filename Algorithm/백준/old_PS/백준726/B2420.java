package 백준726;

import java.util.Scanner;

public class B2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long b = sc.nextLong();

		Long c = a < b ? b - a : a - b;

		System.out.println(c);

	}

}
