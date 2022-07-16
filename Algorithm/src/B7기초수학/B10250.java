package B7기초수학;

import java.util.Scanner;

public class B10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int H;
			int W;
			int in;
			int Y;
			int X;
			
			int loop = sc.nextInt();
			
			for (int i = 0; i < loop; i++) {
				H = sc.nextInt();
				W = sc.nextInt(); // not use
				in = sc.nextInt();

				if( in % H == 0 ) {
					Y = H *100;
					X = in / H;
				}
				else {
					Y = (in % H)*100;
					X = (in / H) + 1;
				}
				

				
				System.out.println(Y+X);
			}
			
			
	}
}
