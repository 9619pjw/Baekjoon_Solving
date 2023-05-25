import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long Max = Long.parseLong(st.nextToken());

        long arr[] = new long[10000001];      // 소수 배열

        for(int i = 2; i < arr.length; i++){  //배열 초기화
            arr[i] = i;
        }

        for(int i = 2; i < Math.sqrt(arr.length); i++){    
            if(arr[i] == 0){
                continue;   // 소수 아니면 넘어감
            }
            for(int j = i + i; j < arr.length; j += i){
                arr[j] = 0; // 소수가 아님을 표시함
            }
        }

        int cnt = 0; // 거의 소수 개수

        for(int i = 2; i < 10000001 ; i++ ){
            if(arr[i] != 0){ // 소수일 경우
                long tmp = arr[i]; // 임시 변수 tmp에 저장
                while ((double)arr[i] <= (double)Max/(double)tmp){  // 현재 소수의 제곱근이 Max보다 작을때 기준
                    if((double)arr[i] >= (double)min/(double)tmp){  // 곱셈이 long의 범위를 넘어설 수 있으므로 이항정리로 처리함 ... N^k와 Max가 아닌 N과 Max / N^k-1을 비교
                        cnt++;
                    }
                    tmp *= arr[i];
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}