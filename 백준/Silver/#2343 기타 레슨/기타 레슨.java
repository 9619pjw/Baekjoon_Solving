import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 강의의 수 입력
        int M = Integer.parseInt(st.nextToken()); // 블루레이 개수 입력

        int[] A = new int[N];
        int start = 0;
        int end= 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i<N; i++){ // 순서대로 강의 입력
            A[i] = Integer.parseInt(st.nextToken());
            if(start < A[i])
                start = A[i]; // 레슨 최댓값을 시작 인덱스로
            end += A[i]; // 레슨 총합을 종료 인덱스로 
            // 시작 인덱스와 종료 인덱스 사이에서 
            // 블루레이 크기의 최솟값을 이진탐색으로 찾음
        }

        while(start <= end){ // 이분탐색
            int mid = (start + end) / 2; // 블루레이의 상한선
            int sum = 0; // 강의시간 합
            int cnt = 0; // 필요한 블루레이 개수
            for(int i =0; i<N; i++){
                if(sum + A[i] > mid){ // sum + A[i] > 중간 인덱스 (블루레이가 찼을 경우)
                    cnt++; // cnt++, sum을 0으로 초기화
                    sum = 0;
                }
                sum += A[i]; // sum에 현재 레슨 시간값 더하기
            }
            if(sum != 0) // sum이 0이 아닌경우 마지막 블루레이가 필요하므로 cnt++
                cnt++;
            if(cnt > M) // 필요한 블루레이 개수 > M ... 중간 인덱스 값으로 모든 레슨 저장 불가능함
                start = mid + 1; // 시작 인덱스 갱신함
            else        // 중간 인덱스 값으로 모든 레슨 저장 가능
                end = mid -1; // 종료 인덱스 갱신
        }
        System.out.println(start); // 블루레이 크기 중 최소 출력
        br.close();
    }
}