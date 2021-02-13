package algo_0202;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_SEWA_2805_농작물수확하기teach {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		// Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= 50; test_case++) {

			int N = Integer.parseInt(br.readLine()); // N은 홀수만 가능하다.

			int farm[][] = new int[N][N];
			int sum = 0;
			for (int i = 0; i < N; i++) { // 행

				String s = br.readLine(); // "14054" char[] value ={'1','4','0','5','4'};

				for (int j = 0; j < N; j++) {
					if (N / 2 <= i + j && i + j <= N / 2 * 3 && -N / 2 <= i - j && i - j <= N / 2) {
						int num = s.charAt(j) - '0';
						sum += num;
					}
				}

			}

			sb.append("#").append(test_case).append(" ").append(sum).append("\n");

		} // end of tc
		System.out.println(sb);

	}// end of main

}// end of class
