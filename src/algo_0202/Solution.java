package algo_0202;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int dx[] = {0,1,0,-1};
		int dy[] = {1,0,-1,0};
		for(int tc=1; tc<=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			
            //N 이 1인 경우를 따로 처리
			if(N == 1) {
				System.out.println("#"+tc);
				System.out.println(1);
				continue;
			}
			int[][] arr = new int[N][N];
           
			int x = 0;
			int y = 0;
			int dir = 0; //처음 방향은 0(우 방향)
			
            
			for(int i=0; i<N*N; i++) {
				
				arr[x][y] = i+1;
				x += dx[dir];
				y += dy[dir];
                
                //범위를 벗어나는 경우 방향 전환
				if(x >= N || y >= N || x < 0 || y < 0) {
					//원래 위치로 돌려주고
                    x -= dx[dir];
					y -= dy[dir];
                    
                    //방향 전환 (0->1 우에서 하/ 1->2 하에서 좌/ 2->3 좌에서 상/ 3->0 상에서 우)
					dir = (dir+1)%4;
                    
                    //전환한 방향으로 이동
					x += dx[dir];
					y += dy[dir];
				}
				
                //이동할 곳에 값이 있는 경우 방향 전환
				if(arr[x][y] != 0) {
					x -= dx[dir];
					y -= dy[dir];
					dir = (dir+1)%4;
					x += dx[dir];
					y += dy[dir];
				}
				
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}