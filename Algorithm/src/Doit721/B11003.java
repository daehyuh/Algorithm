package Doit721;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B11003 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // 출력을 그때 그때 하는 것보다 버퍼에 넣고 한번에 출력하기 위해 BufferedWriter를 사용
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int L = Integer.parseInt(st.nextToken());
	    st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			int now = sc.nextInt();

			while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
				mydeque.removeLast();
			}
			mydeque.addLast(new Node(now, i));
			if (mydeque.getFirst().index <= i - L) {
				mydeque.removeFirst();
			}
		      bw.write(mydeque.getFirst().value + " ");
	    }
	    bw.flush();
	    bw.close();
	}

	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
