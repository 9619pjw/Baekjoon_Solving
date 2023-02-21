import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main{
    public static int binarySearch(int[] arr,  int target){
        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(start <= end){
            mid = (start + end)/2;
            if(arr[mid] == target){
                return 1; // 타겟 발견시 1 반환
            }
            else{ 
                if(arr[mid] > target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return 0; // 타겟 없으면 0 반환
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N]; // 보유 카드 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<arr.length; i++){ // 보유 카드 입력
            arr[i] = Integer.parseInt(st.nextToken());
        }
       
        int M = Integer.parseInt(br.readLine()); // 확인 카드 개수
        int arr2[] = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<M; i++){ // 확인 카드 개수
            arr2[i] = Integer.parseInt(st2.nextToken());
        }
       
        Arrays.sort(arr); // 보유 카드 정렬

        for(int i =0; i<M; i++){ // 이진탐색
            int result = binarySearch(arr, arr2[i]);
            System.out.print(result + " ");
        }
        br.close();
    }
}