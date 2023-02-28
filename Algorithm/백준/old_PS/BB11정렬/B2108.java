package BB11정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2108 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer sb = new StringBuffer();
			int l = Integer.parseInt(br.readLine());
			int[] center = new int[l];
			int[] arr = new int[8001];
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			int sum = 0;
			int cen = 0;

			int mode_max = 0;
			int mode = 0;
			boolean mode_flag = false;

			for (int i = 0; i < l; i++) {
				int n = (Integer.parseInt(br.readLine()));
				sum += n;
				center[i] = n;
				arr[n + 4000]++;

				if (max < n) {
					max = n;
				}
				if (min > n) {
					min = n;
				}

			}

			int swap = 0;
//			for (int i = 0; i < center.length; i++) {
//				for (int j = 0; j < center.length - 1; j++) {
//					if (center[j] > center[j + 1]) {
//						swap = center[j];
//						center[j] = center[j + 1];
//						center[j + 1] = swap;
//					}
//				}
//			}

			Arrays.sort(center);
			cen = center[center.length / 2];

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > mode) {
					mode = arr[i];
					mode_max = i - 4000;
					mode_flag = true;
				} else if (arr[i] == mode && mode_flag == true) {
					mode_max = i - 4000;
					mode_flag = false;
				}
			}

			sb.append((int) Math.round((double) sum / l) + "\n");
			sb.append(cen + "\n");
			sb.append(mode_max + "\n");
			sb.append(max - min + "\n");

			System.out.println(sb);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
