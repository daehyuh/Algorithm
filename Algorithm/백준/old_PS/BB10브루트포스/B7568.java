package BB10브루트포스;
//구현
//브루트포스 알고리즘
import java.util.Scanner;

public class B7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();
		int[][] arr = new int[row][2];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < row; i++) {
			int rank = 1;
			for (int j = 0; j < row; j++) {
				if(i == j) continue;
					if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
						rank++;
					}

			}
			System.out.print(rank+" ");
		}


	}

}
