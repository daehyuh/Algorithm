package BB11정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10989 {

	public static void main(String[] args)  {
		int[] arr = new int[10000+1];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		try {
		
		int l = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < l; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				sb.append(i+"\n");
				arr[i]--;
			}
		}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(sb);
	}

}