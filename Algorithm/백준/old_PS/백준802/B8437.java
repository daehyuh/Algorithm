package 백준802;

import java.math.BigInteger;
import java.util.Scanner;

public class B8437 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger apple = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		BigInteger two = new BigInteger("2");

		System.out.println((apple.add(m).divide(two)));
		System.out.println(apple.subtract(apple.add(m).divide(two)));

	}

}
