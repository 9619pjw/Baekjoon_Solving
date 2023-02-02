import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" "); // N과 K 차례로 입력받음
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		int[] arr = new int[N];
		str = br.readLine().split(" ");
		
		for(int i=0; i<N; i++)
			arr[i] = Integer.parseInt(str[i]);
		
		Arrays.sort(arr);
		
		System.out.println(arr[K-1]);
		
	}
	
}