package algo_0210;

import java.util.Scanner;

/**
 * 숫자퍼즐의 유효성은 어떻게 체크할지? 효율적으로 작성 배열,
 *
 */
public class Solution_SWEA_1974_스도쿠검증 {

	private static int[][] sdo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			sdo = new int[9][9]; // 스도쿠 배열넣기

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sdo[i][j] = sc.nextInt();
				}
			} // 스도쿠 배열 넣기

			System.out.println("#" + test_case + " " + check());
		} // end of tc
		sc.close();
	}// end of main

	// 스도쿠가 정상인지 오류 체크, 정상 :1, 오류 :0
	static int check() {
		for (int i = 0; i < 9; i++) { // 행검사
			if (!checkRow(i)) {
				return 0; // 오류}
			}
		}
		for (int i = 0; i < 9; i++) { // 열검사
			if (!checkCol(i)) {
				return 0; // 오류
			}
		}
		for (int i = 0; i < 9; i++) { // 0,3,6블럭 검사
			for (int j = 0; j < 9; j += 3) {// 0 3 6
				if (!checkBlock(i, j)) {
					return 0;
				}

			}

		}
		return 1; // 정상스도쿠
	}

	// 3*3블럭이 정상인지 체크, 정상 true, 오류 false
	static boolean checkBlock(int r, int c) {
		boolean[] flag = new boolean[10]; // 0번방안씀
		for (int i = 0; i < 3; i++) {// 0 1 2
			for (int j = 0; j < 3; j++) { // 0 1 2
				if (flag[sdo[r + i][c + j]]) {
					return false;
				} else {
					flag[sdo[r + i][c + j]] = true;
				}
			}
		}
		return true;
	}

	// r번째 행이 정상인지 체크, 정상true, 오류false
	static boolean checkRow(int r) {
		boolean[] flag = new boolean[10];// 0번방은 안씀
		for (int j = 0; j < 9; j++) {
			if (flag[sdo[r][j]]) {
				return false; // 오류
			} else {
				flag[sdo[r][j]] = true;
			}
		}
		return true; // 정상 스도쿠
	}

	// c번째 열이 정상인지 체크, 정상true, 오류false
	static boolean checkCol(int c) {
		boolean[] flag = new boolean[10];// 0번방은 안씀
		for (int j = 0; j < 9; j++) {
			if (flag[sdo[j][c]]) {
				return false; // 오류
			} else {
				flag[sdo[j][c]] = true;
			}
		}
		return true; // 정상 스도쿠
	}

}// end of class
