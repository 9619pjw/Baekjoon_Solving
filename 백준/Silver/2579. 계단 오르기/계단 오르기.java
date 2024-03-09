import java.util.*;
import java.io.*;

class Main{
    static int dp[]= new int[301];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 시작점
        dp[1] = arr[1];

        if(N >= 2){
            dp[2] = arr[1] + arr[2];
        }
        
        for(int i = 3; i <= N; i++){
            // i-2까지 밟은 경우 vs i-3까지 밟고 i-1칸 밟은 경우  + 맨 마지막 칸
            dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
        }
        System.out.println(dp[N]);
        br.close();
    }
}