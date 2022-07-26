package 백준726;

import java.util.Scanner;

public class B2754 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[2];
		str = sc.next().split("");

		double score = 0;

		if (str[0].equals("A")) {
			score += 4.0;
			if (str[1].equals("+"))
				score += 0.3;
			if (str[1].equals("-"))
				score -= 0.3;
		}
		if (str[0].equals("B")) {
			score += 3.0;
			if (str[1].equals("+"))
				score += 0.3;
			if (str[1].equals("-"))
				score -= 0.3;
		}
		if (str[0].equals("C")) {
			score += 2.0;
			if (str[1].equals("+"))
				score += 0.3;
			if (str[1].equals("-"))
				score -= 0.3;
		}
		if (str[0].equals("D")) {
			score += 1.0;
			if (str[1].equals("+"))
				score += 0.3;
			if (str[1].equals("-"))
				score -= 0.3;
		}
		if (str[0].equals("F")) {
			score += 0.0;
		}

		System.out.println(score);
	}

}
