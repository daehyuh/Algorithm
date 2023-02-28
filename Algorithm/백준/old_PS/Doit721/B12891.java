package Doit721;

import java.util.Scanner;

import com.sun.javafx.geom.AreaOp.AddOp;

public class B12891 {

	static int[] checkArr;
	static int[] myArr;
	static int checkSecret;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		int S = sc.nextInt();
		int P = sc.nextInt();
		int Result = 0;
		
		char A[] = new char[S];
		
		checkArr = new int[4];
		myArr = new int[4];
		checkSecret = 0;
		
		A = sc.next().toCharArray();
		
		for (int i = 0; i < 4; i++) {
			checkArr[i] = sc.nextInt();
			if (checkArr[i] == 0) {
				checkSecret++;
			}
		}
		
		
		for (int i = 0; i < P; i++) {
			add(A[i]);
		}
		
		if (checkSecret == 4) {
			Result++;
		}

		for (int i = P; i < S; i++) {
			int j = i - P;
			add(A[i]);
			remove(A[j]);
			if (checkSecret == 4) {
				Result++;
			}
		}
		
		System.out.println(Result);
		
	}

	public static void add(char a) {
		if (a == 'A') {
			myArr[0]++;
			if (checkArr[0] == myArr[0])
				checkSecret++;
		}
		if (a == 'C') {
			myArr[1]++;
			if (checkArr[1] == myArr[1])
				checkSecret++;
		}
		if (a == 'G') {
			myArr[2]++;
			if (checkArr[2] == myArr[2])
				checkSecret++;
		}
		if (a == 'T') {
			myArr[3]++;
			if (checkArr[3] == myArr[3])
				checkSecret++;
		}
	}
	public static void remove(char a) {
		if (a == 'A') {
			if (checkArr[0] == myArr[0])
				checkSecret--;
			myArr[0]--;
		}
		if (a == 'C') {
			if (checkArr[1] == myArr[1])
				checkSecret--;
			myArr[1]--;
		}
		if (a == 'G') {
			if (checkArr[2] == myArr[2])
				checkSecret--;
			myArr[2]--;
		}
		if (a == 'T') {
			if (checkArr[3] == myArr[3])
				checkSecret--;
			myArr[3]--;
		}
	}
}
