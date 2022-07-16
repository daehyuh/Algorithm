package B0Test;

public class isPrime {

	public static void main(String[] args) {

		System.out.println(isPrime(2));
	}
	
	public static boolean isPrime(int x) {
		if (x == 1) {
			return false;
		}

		for (int i = 2; i <= (int) Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}
}
