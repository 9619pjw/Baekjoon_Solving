import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int arr[][] = new int[N+1][M+1];

		for(int i =1; i<=N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j =1; j<=M; j++){
				arr[i][j] = Integer.parseInt(st.nextToken()); // 배열 값 입력받음
			}
		}

		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력

		while(T-- >0){
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()); // 좌표값 입력받음
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			int sum = 0;
			for(int j = x1; j <= x2; j++){
				for(int k = y1; k <= y2; k++){
					sum += arr[j][k];	// 누적 합
				}
			}
			System.out.println(sum);
		}
		br.close();
	}
}