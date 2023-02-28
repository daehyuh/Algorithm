package BB10브루트포스;

import java.util.Scanner;

public class B1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int i = 0;
		int cnt = 0;
		while (true) {
			i++;
			if (Integer.toString(i).contains("666")) {
				cnt++;
				if (cnt == l) {
					break;
				}
			}
		}
		
System.out.println(i);
	}

}
