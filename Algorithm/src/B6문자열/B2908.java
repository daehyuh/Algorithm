package B6문자열;

import java.util.Scanner;

public class B2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer(sc.next());
		StringBuffer sb2 = new StringBuffer(sc.next());
		int num1 = Integer.parseInt(sb.reverse().toString());
		int num2 = Integer.parseInt(sb2.reverse().toString());

		if (num1 > num2) System.out.println(num1);
		else System.out.println(num2);

	}

}
