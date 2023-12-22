import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int a = Integer.parseInt(br.readLine()); // 입력값

      int crossCount = 1;     // 대각선의 칸 개수
      int prevCount = 0;      // 해당 대각선의 직전 대각선까지의 누적 합

      while(true){
        if(a <= prevCount + crossCount){ // 대각선 칸의 개수, 직전 대각선 누적합으로 범위 판별 
          if(crossCount % 2 == 1){
            // 대각선의 칸 개수가 홀수 ... 분자가 큰 숫자부터 시작함
            // 분자 = 대각선의 칸 수 - (a번째 - 직전 대각선까지의 칸 개수 -1)
            // 분모 = a번째 - 직전 대각선까지의 칸 수
            System.out.print((crossCount - (a - prevCount-1)) + "/" + (a - prevCount));
            break;
          }
          else{
            // 대각선의 칸 개수가 짝수 ... 분모가 큰 숫자부터 시작
            System.out.print((a - prevCount) + "/" + (crossCount - (a - prevCount-1)));
            break;
          }
        } else{
          prevCount += crossCount;
          crossCount++;
        }
    }
  }
}