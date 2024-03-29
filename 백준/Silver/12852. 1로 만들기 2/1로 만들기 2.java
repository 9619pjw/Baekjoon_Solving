import java.util.*;
import java.io.*;

class Main{
    static int n;
    static int[] dp;
    static int[] trace;
    public static void main(String[] args) throws Exception{
        //연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        //3으로 나눔, 2로 나눔, 1을 뺌
        dp = new int[n+1];
        trace = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = Integer.MAX_VALUE;
        }

        //dp[i] = i를 1로 만드는 연산 횟수의 최솟값
        dp[1] = 0;
        for(int i=2; i<=n; i++){
            //3으로 나누는 경우
            if(i%3==0 && dp[i] > dp[i/3]+1){
                dp[i] = dp[i/3]+1;
                trace[i] = i/3;
            }
            //2로 나누는 경우
            if(i%2==0 && dp[i] > dp[i/2]+1){
                dp[i] = dp[i/2]+1;
                trace[i] = i/2;
            }
            //1을 빼는 경우
            if(i-1>0 && dp[i] > dp[i-1]+1){
                dp[i] = dp[i-1]+1;
                trace[i] = i-1;
            }
        }

        //10 > 9 > 3 > 1
        bw.write(String.valueOf(dp[n])+'\n');
        int num = n;
        for(int i=0; i<=dp[n]; i++){
            bw.write(String.valueOf(num) + " ");
            num = trace[num];
        }

        bw.flush();
        bw.close();
        br.close();
    }
}