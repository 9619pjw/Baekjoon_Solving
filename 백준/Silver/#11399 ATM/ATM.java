import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sum = new int[N]; // 합 저장할 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열 오름차순 정렬

        int tmp = arr[0];
        sum[0] = tmp;
        for(int i =1; i<N; i++){
            tmp += arr[i];
            sum[i] = tmp; // 누적된 합 sum배열에 저장함
        }
        int result = 0;
        for(int i =0; i<N; i++){
            result += sum[i]; // sum 배열의 모든 요소를 더함
        }
        
        System.out.println(result);
        br.close();
    }
}