import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 끝자 0이 나오는 경우 ... 2와 5가 곱해져 있을 때임.
        // == 소인수분해해서 2와 5가 존재하면 뒷자리는 0으로 끝남
        // 2는 5보다 작은 수여서 연속된 수를 곱하게 되면 
        // 자연스레 모든 값들의 소인수 분해들은 2의 개수가 5의 개수보다 많음
        // 5의 n승마다 카운트를 추가해줌.

        while(N >= 5){
            cnt += N / 5;
            N /= 5;
        }

        System.out.println(cnt); // 0의 개수 출력함
        br.close();
    }
}