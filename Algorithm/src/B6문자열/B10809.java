package B6문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String arr[] = str.split("");
		String check = "abcdefghijklmnopqrstuvwxyz";
		String checkarr[] = check.split("");
		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < checkarr.length; i++) {
			myMap.put(checkarr[i], -1);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (myMap.get(arr[i]) == -1) {
			myMap.put(arr[i], i);
			}
		}
		
		for (int i = 0; i < checkarr.length; i++) {
			if (myMap.get(checkarr[i]) != null) {
			System.out.print(myMap.get(checkarr[i]));
			}else {
				System.out.print("-1");
			}
			
			if (i!=checkarr.length-1) {
				System.out.print(" ");	
			}
		}
		
	}

}
