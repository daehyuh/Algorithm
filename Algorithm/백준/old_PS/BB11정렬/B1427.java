package BB11정렬;
//문자열
//정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class B1427 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		try {
			String str = br.readLine();
			
			String[] strArr = str.split("");
			Integer[] intArr = new Integer[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i]);
			}
			int swap = 0;
			
			Arrays.sort(intArr,Collections.reverseOrder());
//			for (int i = 0; i < intArr.length; i++) {
//				for (int j = 0; j < intArr.length-1; j++) {
//					if (intArr[j] < intArr[j+1]) {
//						swap = intArr[j];
//						intArr[j] = intArr[j+1];
//						intArr[j+1] = swap;
//					}
//				}
//			}
			
			for (int i : intArr) {
				sb.append(i);
			}
			
			System.out.println(sb);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
