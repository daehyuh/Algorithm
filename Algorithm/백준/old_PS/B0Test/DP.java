package B0Test;

public class DP {
	static int dp[] = {-1};
	
public static void main(String[] args) {
	//{1, 3, 5}을 사용하여 N 을 만드는 방법

	int x = state(7);
	System.out.println(x);
}
	public static int state(int n) {
		if (n<0) {
			return 0;
		}
		
		if(n==0) {
			return 1;
		} 
		
//		if (dp[n]!=-1) {
//			return dp[n];
//		}
		
		System.err.println(n);

		
		
		return state(n-1) + state(n-3) + state(n-5);
		
		}
	
	
}


//just {1, 3, 5}
//
//state(n=6)
//1+1+1+1+1+1
//1+1+1+3
//1+1+3+1
//1+3+1+1
//3+1+1+1
//3+3
//1+5
//5+1
//
//state(n=4)
//1+1+1+1
//1+3
//3+1
//
//state(n=2)
//1+1
//
//state(7)
//state(7) = state(6) + state(4) + state(2)

