package 백준726;

import java.util.Scanner;

public class B1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.next();
			if (str.equals("0")) {
				break;
			}
			String str2 = "";
			String[] strArr = str.split("");

			for (int j = strArr.length - 1; j >= 0; j--) {
				str2 += strArr[j];
			}
			if (str.equals(str2)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}

}
