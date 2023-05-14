import java.util.*;
import java.io.*;


class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine()); // 목표 합 S
		long cnt = 1;
		long sum = 1; 

		while(sum < S){ // 1부터 차례로 더하면서 sum이 S보다 크거나 같을때 반복문 종료
			cnt++;
			sum += cnt;
		}

		if(sum > S){ // sum이 S보다 커지면 
			cnt--; // 현재 경우의 수 빼주기
		}
		System.out.println(cnt);
		br.close();
	}
}