package B6문자열;

import java.util.Scanner;

public class B2675 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		int loop2 = 0;
		String arr[];
		for (int i = 0; i < loop; i++) {
			loop2 = sc.nextInt();
			arr = sc.next().split("");
			
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < loop2 ; k++) {
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		
	}

}
