package 백준802;

import java.math.BigInteger;
import java.util.Scanner;

public class B24309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();

		System.out.println((b.subtract(c)).divide(a));
	}

}