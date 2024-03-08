import java.util.*;
import java.io.*;

class Main{
    static int dp[]= new int[1001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        dp[1] = 1;
        dp[2] = 3;
        
        for(int i = 3; i < N+1; i++){
            // i-1까지 채워진 경우(1개의 선택지) + i-2까지 채워진 경우(2개의 선택지)
            dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
        }
        System.out.println(dp[N]);
        br.close();
    }
}