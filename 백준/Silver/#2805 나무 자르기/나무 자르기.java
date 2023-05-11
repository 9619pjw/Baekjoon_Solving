import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		binary(arr, M);
		br.close();
	}
	public static void binary(int[] arr, int M){
		long low = 1;
		long high = arr[arr.length-1];
		while(low <= high){
			long cnt = 0;
			long mid = (low + high) / 2;

			for(int i = 0; i < arr.length; i++){
				if(arr[i] <= mid)
					continue;
				cnt += arr[i] - mid;
			}
			if(cnt < M)
				high = mid -1;
			if(cnt >= M)
				low = mid + 1;
		}
		System.out.println(high);
	}
}