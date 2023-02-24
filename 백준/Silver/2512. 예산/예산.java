import java.io.*;
import java.util.*;

class Main{
    static int sum =0;
    static int arr[];
    static int N;
    static int M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
       
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        M = Integer.parseInt(br.readLine()); // 총 예산 입력
        
        Arrays.sort(arr); // 배열 정렬
        
        System.out.println(binarySearch());
    }
    public static int binarySearch(){
        if(sum <= M){ // 총합 < 예산일 경우, 배열의 최댓값을 출력
            return arr[N-1];
        }
        int low = 0; // 이분 탐색을 위한 low, high
        int high = arr[N-1];

        while(low <= high){
            int tmp = 0; // 임시합계 저장위한 변수
            int mid = (low + high) /2; // 상한가

            for(int i = 0; i<N; i++){
                if(arr[i] > mid) // 배열 요소 > 상한가
                    tmp += mid; // 임시변수에 상한가 더함
                else            // 배열 요소 <= 상한가
                    tmp += arr[i]; // 임시변수에 배열 요소 더함
            }

            if(tmp > M){ // 임시 합계 > 총 예산
                high = mid-1; // 상한가 조정
            }else if(tmp <M){ // 임시 합계 < 총 예산
                low = mid+1; // 상한가 조정
            }else // 임시 합계 == 총 예산
                return mid; // 중간값 출력
        }
        return high; 
    }
}