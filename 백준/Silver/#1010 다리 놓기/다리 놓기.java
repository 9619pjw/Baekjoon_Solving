import java.util.*;
import java.io.*;
class Main{
  static int N = 30;
  static int K;
  static long dp[][];
  public static void main(String[] args)throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      dp = new long[N+1][N+1];
    
      for(int i = 0; i <= N ; i++){
        dp[i][0] = 1;   // i개의 선택지 중 아무것도 선택 안했을 경우 : 1
        dp[i][1] = i;   // i개의 선택지 중 1개를 선택했을 경우 : i
        dp[i][i] = 1;   // i개의 선택지 중 i개를 선택했을 경우 : 1
      }

      for(int i =2; i <= N; i++){
        for(int j = 1; j < i; j++){
          dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
        }
      }

      K = Integer.parseInt(br.readLine());

      for(int i = 0 ; i < K; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(dp[B][A] + "\n");
      }
    
      bw.flush();
      bw.close();
      br.close();
    }
}