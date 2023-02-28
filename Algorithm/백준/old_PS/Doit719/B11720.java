package Doit719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11720 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int l = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] strArr = str.split("",l);
			int sum = 0; // 합
			for (int i = 0; i < strArr.length; i++) {
				sum += Integer.parseInt(strArr[i]);
			}
			System.out.println(sum);
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
