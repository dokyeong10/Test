import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution_SWEA_1201_Ladder1_내가 {
	static int[][] la;
	static int dr[] = {-1,1,0,0};
	static int dc[] = {0,0,-1,1};

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int test_case = 1; test_case <=10; test_case++) {
			
		

		la = new int[100][100];
		for (int i = 0; i < 100; i++) {
			
			for (int j = 0; j < 100; j++) {
				la[i][j] = Integer.parseInt(br.readLine()); 
			}
		}
		int nr ,nc =0;
		int dir=0;
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				nr= i+dr[dir];
				nc= i+dc[dir];
				if(la[0][j]==1) {
					if(nr<100||nr>=0|| nc<100||nc<=0) { //범위가 넷중에 하나라도 있을때
						if(nr==1) {
							nr+=dr[dir];
							
						}if(nc==1) {
							nc+=dc[dir];
							
						}
							
					}
				}
						
			}
		}
		
	}// end of tc
	}//end of main
}// end of class
