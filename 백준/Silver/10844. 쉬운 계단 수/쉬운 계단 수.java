import java.util.*;
import java.io.*;

class Main {
    static long mod = 1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long dp[][] = new long[N+1][11];

        // 길이가 1일 때 만드는 높이 H로 끝나는 계단 수의 모든 경우의 수는 1
        for(int i = 1; i <= 9; i++){
            dp[1][i] = 1;
        }

        for(int i = 2; i <= N; i++){
            dp[i][0] = dp[i-1][1];  // N에서 높이가 0이면 N-1에서는 높이가 1이여야함
            dp[i][9] = dp[i-1][8];  // N에서 높이가 9이면 N-1에서는 높이가 8이여야 함.

            // 높이가 1~8인 경우, N-1에서 자신보다 한단계 위거나 한단계 아래 높이
            for(int j = 1; j <= 8; j++){
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % mod;
            }
        }

        long sum = 0;

        for(int i = 0; i < 10; i++){
            sum = (sum + dp[N][i]) % mod;
        }

        System.out.println(sum);
        br.close();
    }
}