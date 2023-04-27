import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배열의 크기 입력
        int K = Integer.parseInt(br.readLine()); // 출력할 인덱스

        // low <= x <= high
        long low = 1;
        long high = K;

        while(low < high){
            long mid = (low + high) / 2; // 임의의 x(mid)를 중간값으로 설정.
            long cnt = 0; // 중앙값보다 작은 수의 개수

            // 임의의 x에 대해 i번째 행을 나눔으로써 
            // x보다 작거나 같은 원소의 개수의 누적합을 구함
        
            for(int i = 1 ; i <= N ; i++){
                cnt += Math.min(mid/i, N);  // 각 행의 원소개수가 N개를 초과하지 않는 선에서 카운트.
            }

            if(K <= cnt) // 현재 중앙값보다 작은 수의 개수가 K보다 크거나 같음
                high = mid; // 종료 인덱스 갱신
            else  { // 현재 중앙값보다 작은 수의 개수가 K보다 작음
                low = mid + 1; // 시작 인덱스 갱신
            }
        }
        System.out.println(low);
        br.close();
    }
}