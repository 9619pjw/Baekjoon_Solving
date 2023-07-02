import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());
		int arr[] = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		for(int i =0; i<arr.length; i++){
			if(arr[i] % 10 == a)
				cnt++;
		}
		System.out.println(cnt);
		br.close();
	}
}