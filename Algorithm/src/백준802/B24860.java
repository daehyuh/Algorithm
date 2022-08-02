package 백준802;

import java.util.Scanner;

public class B24860 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long vk = sc.nextLong();
		long jk = sc.nextLong();
		long va = sc.nextLong();
		long ja = sc.nextLong();
		long vh = sc.nextLong();
		long dh = sc.nextLong();
		long jh = sc.nextLong();
		long result = ((vk * jk) + (va * ja)) * (vh * dh * jh);
		System.out.print(result);

	}

}
