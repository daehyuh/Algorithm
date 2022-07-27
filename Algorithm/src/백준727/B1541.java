package 백준727;

import java.util.Scanner;

public class B1541 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] A = sc.next().split("-");
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			int sum = 0;
			String[] b = A[i].split("\\+");
			for (String string : b) {
				sum += Integer.parseInt(string);
			}
			if (i == 0) {
				result += sum;
			} else {
				result -= sum;
			}
		}
		
		System.out.println(result);

	}

}
