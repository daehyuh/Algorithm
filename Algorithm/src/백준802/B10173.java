package 백준802;

import java.util.Scanner;

public class B10173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regex = "(?i).*nemo.*";
		while (true) {
			String str = sc.nextLine();
			if (str.equals("EOI")) {
				break;
			}
			if(str.matches(regex)) {
				System.out.println("Found");
			} else {
				System.out.println("Missing");
			}
		}

	}

}
