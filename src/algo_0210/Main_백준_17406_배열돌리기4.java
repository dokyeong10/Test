package algo_0210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_17406_배열돌리기4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); // 배열의 행
		int M = Integer.parseInt(st.nextToken()); // 배열의 열
		int k = Integer.parseInt(st.nextToken()); // 회전 연산 개수
		int arr[][] = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 배열입력 받기
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken()); // 회전연산 행
			int c = Integer.parseInt(st.nextToken()); // 회전연산 열
			int s = Integer.parseInt(st.nextToken()); // -+ 값
			// 회전연산 입력받기 완료 
			
			int num =Math.min(r, c)/2;
			
			for (int j = 0; j < num; j++) {
				int x =j;
				int y =j;
				int h =
			}
			
		}
		
		

	}// end of main

}// end of class
