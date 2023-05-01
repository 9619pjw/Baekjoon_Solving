import java.util.*;
import java.io.*;
/* 
동전을 최소로 사용하여 목표 금액 달성 == 가장 가격이 큰 동전부터 사용
1. 가격이 큰 동전부터 내림차순으로 K와 같거나 작은 동전 탐색
2. 탐색을 멈춘 동전 가격으로 K를 나눠 몫은 동전개수에 더하고 나머지는 K값 갱신
3. 나머지가 0이 될때까지 반복
*/ 

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 동전의 수
        int K = Integer.parseInt(st.nextToken()); // 목표 금액
        int A[] = new int[N]; // 동전 종류
        int cnt = 0; // 필요한 동전의 개수

        for(int i =0; i<N; i++){
            A[i] = Integer.parseInt(br.readLine()); // 동전 종류 기입            
        }

        for(int i = N-1; i>=0; i--){ // 크기가 큰 동전부터 탐색
            if(A[i] <= K){ // 현재 동전의 크기가 목표 금액보다 작거나 같으면 
                cnt += K / A[i]; // 동전 개수 갱신
                K %= A[i];      // 목표 금액 갱신
            }
        }

        System.out.println(cnt);
        br.close();
    }
}