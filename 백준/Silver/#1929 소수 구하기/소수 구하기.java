import java.util.*;
import java.io.*;

class Main{
	public static boolean[] prime; // 소수인지 아닌지 판별
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		prime = new boolean[M+1];
		isPrime();

		StringBuilder sb = new StringBuilder();

		for(int i = N ; i <= M; i++){
			if(!prime[i])
				sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

	public static void isPrime(){
		prime[0] = prime[1] = true; // 0과 1은 소수가 아님.

		for(int i =2; i<= Math.sqrt(prime.length); i++){ //  N 을 √N 이하의 자연수들로만 나눔.
			if(prime[i]) // 이미 체크되어있으면 skip
				continue;
			for(int j = i * i; j< prime.length; j += i){ // i의 배수들을 걸러줌
				prime[j] = true;
			}
		}
	}
}