package 백준802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B14928 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		long remain = 0;
		for (int i = 0; i < N.length(); i++) {
			remain = (remain * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		bw.write(remain + "\n");
		bw.flush();
		br.close();
		bw.close();
	}

}
