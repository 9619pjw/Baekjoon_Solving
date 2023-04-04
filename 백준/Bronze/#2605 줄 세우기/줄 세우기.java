import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int[] ret = new int[N];
		ret[0]=1;
		for(int i = 1; i < N; i++) {
			int idx = i - arr[i]; // 이동할 위치
			for(int j = i; j >= idx+1; j--) { // 이동할 다음 인덱스까지
				ret[j]= ret[j-1];  // 한 칸씩 밀기.
			}
			ret[idx]=i+1;//빈 자리에 채우기.
			
		}
		for (int i = 0; i < ret.length; i++) {
			System.out.print(ret[i]+" ");
		}
		br.close();
	}
}