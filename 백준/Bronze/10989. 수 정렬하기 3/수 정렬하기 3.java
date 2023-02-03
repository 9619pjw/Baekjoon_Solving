import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		StringBuilder sb = new StringBuilder(); // 빠른 출력을 위해 StringBuilder 생성함

		for(int i =0 ;i<N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);

		for(int i : arr){
			sb.append(i).append('\n'); // 받은값들을 StringBuilder에 넣음
		}
		System.out.println(sb);
	}
	
}