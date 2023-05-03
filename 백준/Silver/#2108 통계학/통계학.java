import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int sum = 0;
		int mid = 0; // 중앙값
		int[] max_arr = new int[8001]; // 최빈값 배열 -4000 ~ 4000
		int max = -4000, min = 4000; // 범위
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			
			// 최빈값 배열 갱신
			max_arr[arr[i] + 4000]++;
			
			
			// 범위
			if(N == 1) { // 입력값이 1개면 범위가 0
				max = 0;
				min = 0;
			}else {
				if(max < arr[i]) {
					max = arr[i];
				}
				if(min > arr[i]) {
					min = arr[i];
				}
			}			
		}
		
		Arrays.sort(arr);
		mid = arr[N/2]; // 중앙값
		
		int max_cnt = 0; // 최빈값 빈도수
		int result = 0; // 최빈값
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt < max_arr[i]) { // 최빈값 갱신
				max_cnt = max_arr[i];
				result = i - 4000;
			}
		}
		int cnt = 0;
		for(int i = 0; i < max_arr.length; i++) {
			if(max_cnt == max_arr[i]) { // 최빈값이 중복일 경우, 두번째로 작은 정수를 출력해야함.
				result = i - 4000;
				if(cnt == 1) {
					break;
				}
				cnt++;
			}
		}
		System.out.println((int)Math.round((double)sum/N)); // 산술평균
		System.out.println(mid); // 중앙값
		System.out.println(result); // 최빈값
		System.out.println(max - min); // 범위
		br.close();
	}
}