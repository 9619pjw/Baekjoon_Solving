import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        int[] tmp = new int[N+1];
        for (int i =1; i<arr.length; i++){
            arr[i] = i; // 바구니 정렬
        }
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken()); //출발점
            int end = Integer.parseInt(st.nextToken()); // 끝점 
            int mid = Integer.parseInt(st.nextToken()); // 정렬 기준점
            for(int j = 0; j<end-mid+1; j++){
                tmp[start+j] = arr[mid+j]; // 기준점 뒷부분을 임시배열 앞쪽에 저장
            }
            for(int j = 0; j<mid-start; j++){
                tmp[start+end-mid+1+j] = arr[start+j]; // 기준점 앞부분을 임시배열 뒷쪽에 저장
            }
            for(int j =start; j<=end; j++){
                arr[j] = tmp[j]; // 임시배열을 다시 옮김
            }
        }
        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        br.close();
    }
}