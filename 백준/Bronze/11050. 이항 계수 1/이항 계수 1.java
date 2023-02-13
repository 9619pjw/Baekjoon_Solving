import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		dp = new int[N+1][K+1]; 
		
		sb.append(combination(N, K)); 
		System.out.println(sb);
		
	}
	
	public static int combination(int N, int K) {
		if(dp[N][K] > 0) { // nCk가 존재한다면 
			return dp[N][K]; // 배열에 저장된 이항계수를 반환함
		}
		
		if(N == K || K == 0) { // nCn 또는 nC0은 1
			return dp[N][K] = 1;
		}
		return dp[N][K] = combination(N-1, K-1) + combination(N-1, K);
	}

}


