package hw_0209;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_1974_스도쿠검증 {
	static Set<Integer> s = new HashSet<>();

	static int[][] a = new int[9][9];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < args.length; j++) {
					a[i][j] = sc.nextInt();
				}

			}
			for (int[] is : a) {
				System.out.println(Arrays.toString(is));

			}

			System.out.println("#" + test_case + " " + valid());
		}
		sc.close();

	}

	static int valid() {
		for (int i = 0; i < 9; i++) {
			s.clear();
			for (int j = 0; j < 9; j++) {
				s.add(a[i][j]);
			}
			if (hsum != 45)
				return 0;
			
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int sum = 0;
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < 3; l++) {
						sum += a[3 * i + k][3 * j + l];
					}
				}
				if (sum != 45)
					return 0;
			}
		}

		return 1;
	}

}
