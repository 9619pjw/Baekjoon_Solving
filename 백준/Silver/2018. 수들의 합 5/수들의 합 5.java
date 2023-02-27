import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int cnt = 1; // N이 입력한 숫자 하나만 뽑을 경우의 수를 미리 넣음 
        int sum = 1;
        for(int i =0; i<N; i++){
            arr[i] = i+1; // 배열에 1부터 N까지 숫자 저장
        }
        int start_index = arr[0];
        int end_index = arr[0];

        while(end_index != N){
            if(sum == N){
                cnt++;
                end_index++; // 연속된 자연수의 범위 한칸 확장
                sum += end_index;
            }else if(sum > N){
                sum -= start_index;
                start_index++; // 연속된 자연수에서 왼쪽 값 삭제
            }else{
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}