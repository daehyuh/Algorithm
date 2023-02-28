package BB10브루트포스;
//브루트포스 알고리즘
import java.util.Scanner;

public class B2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arrLimit = sc.nextInt();
		int limit = sc.nextInt();
		int[] arr = new int[arrLimit];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if (i!=j &&j!=j2&&j2!=i && (arr[i]+arr[j]+arr[j2]<=limit)) {
						max = Math.max(arr[i]+arr[j]+arr[j2],max);
					}
				}
			}
		}
		
		System.out.println(max);

	}

}
