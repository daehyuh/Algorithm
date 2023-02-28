package B6문자열;

import java.util.Scanner;

public class B11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //you can not use it
		String nums = sc.next();
		int sum = 0;
		
		String[] numsArray = nums.split("", a); // you can use nums.split("",a)

		for (String string : numsArray) {
			sum = sum + Integer.parseInt(string);
		}
		
		System.out.println(sum);
	}

}
