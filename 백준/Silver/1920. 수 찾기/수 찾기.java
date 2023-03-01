import java.io.*;
import java.util.*;
class Main{
    public static int[] arr;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 배열 정렬

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++){
            if(binarySearch(Integer.parseInt(st2.nextToken())) >= 0){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
    public static int binarySearch(int x){ // 이진탐색
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int mid = (low + high) /2;

            if(x < arr[mid]){
                high = mid -1;
            }else if(x > arr[mid]){
                low = mid +1;
            }else{
                return mid;
            }
        }
        return -1; // 탐사 실패시 반환
    }
}