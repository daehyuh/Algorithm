package Doti723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1377 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int l = Integer.parseInt(bf.readLine());
		mDate[] date = new mDate[l];

		for (int i = 0; i < date.length; i++) {
			date[i] = new mDate(Integer.parseInt(bf.readLine()), i);
		}
		
		Arrays.sort(date);
		
		int Max = 0;
		
		for (int i = 0; i < l; i++) {
			if (Max < date[i].index - i) {
				Max = date[i].index - i;
			}
		}
		
		System.out.println(Max + 1);

	}
}

class mDate implements Comparable<mDate> {
	int value;
	int index;

	public mDate(int value, int index) {
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(mDate o) {
		return this.value - o.value;
	}

}
