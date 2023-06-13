import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long result = n;

        for(long p = 2; p <= Math.sqrt(n); p++){ // 2부터 n의 제곱근까지 탐색
            if(n%p == 0) {       // 현재 값이 소인수라면
                result -= (result/p); // 결괏값 업데이트
                while (n%p == 0){ 
                    n /= p; // 소인수를 제거함.
                } 
            }
        }

        if(n > 1)  // 반복문 종료후 n이 1보다 크면 마지막 소인수임.
            result -= (result/n); // 결괏값 업데이트 
        System.out.println(result);
        br.close();
    }
}