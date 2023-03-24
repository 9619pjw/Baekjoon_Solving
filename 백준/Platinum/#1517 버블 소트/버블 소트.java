import java.io.*;
import java.util.*;

public class Main {
	static long cnt=0; // 스왑횟수 
	static int[] tmp; // 정렬시 사용할 임시배열
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];  // 정렬할 배열 arr
		tmp = new int[N];
        
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		divide(arr, 0, N-1);
		System.out.println(cnt);
	}
	public static void divide(int[] arr, int start, int end) { // 분할
		if (end-start == 0) return; // 시작점과 끝점이 같으면 종료
			int mid = (start+end) / 2; // 중간점 기준으로 분할
			divide(arr, start, mid); // 앞의 그룹 분할
			divide(arr, mid+1, end); // 뒤의 그룹 분할
			merge(arr, start, end, mid); // 병합
			for(int i=start; i<=end; i++) { // tmp의 내용물을 arr에 저장
				arr[i]=tmp[i];
			}
	}
	
	public static void merge(int[] arr, int start, int end, int mid) { // 병합					
		int tmpIndex = start; // 정렬될 배열의 시작점
		int left = start; // 앞의 그룹 시작점
		int right = mid+1; // 뒤의 그룹 시작점
		while(left<=mid && right<=end) { 
			if(arr[left]>arr[right]) { // 앞의 그룹 시작점이 뒤의 그룹 시작점보다 크면
				cnt += right - tmpIndex;  // 스왑 발생
				tmp[tmpIndex++] = arr[right++]; //뒤의 그룹 시작점이 임시배열에 들어감
			}else{
				tmp[tmpIndex++] = arr[left++]; // 앞의 그룹 시작점이 임시배열에 들어감
			}
		}
        // 반복문 종료 이후 남아있는 데이터 정리함.
		while(left<=mid) {
			tmp[tmpIndex++] = arr[left++];
		}
		while(right<=end) {
			tmp[tmpIndex++] = arr[right++];
		}
	}
}