import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.lang.StringBuilder;

class Main{
    
    public static int lowerBound(int[] arr, int key){ // 하한
        int low = 0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high) / 2; // 중간위치   

            if(key <= arr[mid]){ // key값이 중간 위치 값보다 작거나 같음
                high = mid;   // 중복 원소에 대해 왼쪽으로 탐색함
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int upperBound(int[] arr, int key){
        int low =0;
        int high = arr.length;

        while(low < high){
            int mid = (low + high) /2;

            if(key < arr[mid]){ // key값이 중간 위치의 값보다 작을 경우
                high = mid;     // 최대치 조정
            }
            else{           // 중복원소 처리
                low = mid +1;
            }
        }
        return low;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N]; // 보유 카드 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i =0; i<arr.length; i++){ // 보유 카드 입력
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 보유 카드 정렬

        int M = Integer.parseInt(br.readLine()); // 확인 카드 개수
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<M; i++){ 
            int target = Integer.parseInt(st2.nextToken());
            sb.append(upperBound(arr, target) - lowerBound(arr, target)).append(" ");
            // 상한선과 하한선을 뺀 값 = 중복되는 카드의 개수
        }
        System.out.println(sb);
        br.close();
    }
}