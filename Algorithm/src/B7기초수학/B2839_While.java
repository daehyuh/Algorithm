package B7기초수학;
//수학
//다이나믹 프로그래밍
//그리디 알고리즘
import java.util.Scanner;

public class B2839_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		 int bong = 0;
		
		while(true){
			if(n%5==0) {
				bong += n/5;
				System.out.print(bong);
				break;
			} else {
				n -= 3;
				bong++;
			}
			if (n<0) {
				System.out.println("-1");
				break;
			}	
		}
	}



}
