import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] dp = new int[N+2]; // dp[i] == i일차부터 퇴사일까지 벌 수 있는 최대 수입
		int[] T = new int[N+1];  // T[i] == i일차 상담 소요 시간
		int[] P = new int[N+1];  // P[i] == i일차 상담 수입

		for(int i = 1; i <= N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
			
		for(int i = N; i > 0; i--){
			if(i + T[i] > N + 1){ // i일차 상담 + 상담 일수 > 퇴사일
				dp[i] = dp[i+1]; // i+1일차 부터 퇴사일까지의 최대 수입을 저장
			} else{ 			// i일차 상담 + 상담 일수 =< 퇴사일
				/** 
				* i+1일차부터 퇴사일까지의 최대 수입 
				*             vs 
				* i일차 상담 비용 + i일차 상담 이후 퇴사일까지의 최대 수입
				**/
				dp[i] = Math.max(dp[i+1], P[i] + dp[i + T[i]]); 
			}
		}
		// 1일부터 퇴사일까지 벌 수 있는 최대 수입 출력
		System.out.println(dp[1]);
        br.close();
    }
}