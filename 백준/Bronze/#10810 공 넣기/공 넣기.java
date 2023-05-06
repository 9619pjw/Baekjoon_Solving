import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];

		
		for(int i = 0 ; i < M; i++){
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			for(int j = I-1; j<J; j++){ // I번째 부터 J번째 바구니까지 K를 채워넣음
				arr[j] = K; 
			}
		}

		for(int i = 0; i < N; i++){
			System.out.print(arr[i] + " "); // 1번부터 N번 바구니에 들어있는 공의 번호 출력
		}
		br.close();
	}
}