package B6문자열;

import java.util.Scanner;

public class B2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		str = str.replaceAll("c=", "!");
		str = str.replaceAll("c-", "!");
		str = str.replaceAll("dz=", "!");
		str = str.replaceAll("d-", "!");
		str = str.replaceAll("lj", "!");
		str = str.replaceAll("nj", "!");
		str = str.replaceAll("s=", "!");
		str = str.replaceAll("z=", "!");
		
		int cnt = str.length();

		System.out.println(cnt);

	}

}
