import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken()); // 보유한 랜선의 개수
		int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수

		int[] arr = new int[K];
		for(int i = 0 ; i < arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr); // 정렬
		binarySearch(arr, N); // 이분탐색
		br.close();

	}

	public static void binarySearch(int[] arr, int N){
		long low = 0; // 최소 길이
		long high = arr[arr.length -1]; // 최대 길이
		long mid = 0;
        
        high++;
		while(low < high){
			mid = (low + high) / 2; // 중간 길이
			long cnt = 0; // 개수를 담을 변수

			for(int i = 0; i < arr.length; i++){ // 구해진 중간 길이로 잘라서 몇개가 나오는지 확인
				cnt += (arr[i] / mid);
			}

			if(cnt < N) // mid 길이로 자른 개수 < 필요한 랜선 개수
				high = mid; // 최대 길이 갱신 ... 자르는 길이를 줄임
			else	// mid 길이로 자른 개수 >= 필요한 랜선 개수
				low = mid + 1;

		}
		System.out.println(low-1);
	}
}