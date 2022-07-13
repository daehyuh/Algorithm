package B6문자열;

import java.util.Scanner;
import java.util.StringTokenizer;


public class B1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String[] strArr = sc.nextLine().trim().split(" ");
//		System.out.print(strArr.length);
		
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		System.out.println(st.countTokens());
		
	}

}
