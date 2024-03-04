import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 지불해야할 금액
		int[] arr = {500, 100, 50, 10, 5, 1}; // 동전 종류
		int result = 1000 - N; // 받을 거스름돈
		int cnt = 0; // 동전 개수

		while (result > 0 ){ // 거스름돈을 큰 동전부터 나눔.
			int i = 0;
			while(true){
				if(result >= arr[i]){
					result -= arr[i];
					cnt++;
					break;
				}
				else
					i++;
			}
		}
		
		System.out.println(cnt);

		br.close();
	}
}