import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];
		int tmp = 0; // 가산점
		int sum = 0; // 총점
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i< T; i++){
			arr[i] = Integer.parseInt(st.nextToken());

			if(arr[i] == 1){ // 1 입력시 가산점 증가
				++tmp;
				sum += tmp;
			}
			else if(arr[i] == 0){ // 0 입력시 가산점 초기화
				tmp = 0;
				sum += tmp;
			}
		}
		System.out.println(sum);

		br.close();
	}
}