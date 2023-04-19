import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = 0; // 컴퓨터 개수 최댓값
        for(int i = 0; i<N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(i != N-1){ // 맨 끝자리가 아닌 경우 -1
                arr[i] -= 1;
            }
            max += arr[i]; // 최댓값 업데이트
        }
        System.out.println(max);
        br.close();
    }
}