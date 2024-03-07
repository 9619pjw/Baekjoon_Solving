import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// dp[i][0] : 길이 i에서 끝이 0으로 끝나는 이친수의 개수
		// dp[i][1] : 길이 i에서 끝이 1으로 끝나는 이친수의 개수
		long dp[][] = new long[N+1][2];
		dp[1][1] = 1; 
		dp[1][0] = 0;
	

		for(int i = 2; i <= N; i++){
			dp[i][0] = dp[i-1][1] + dp[i-1][0]; // 0은 이전 단계의 0과 1로 끝나는 모든 경우에 붙일 수 있음
			dp[i][1] = dp[i-1][0]; // 1은 이전 단계가 0으로 끝나는 경우만 붙일 수 있음.
		}
		System.out.println(dp[N][0] + dp[N][1]);
        br.close();
    }
}