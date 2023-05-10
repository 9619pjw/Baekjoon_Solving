import java.util.*;
import java.io.*;

class Main{
	static boolean[] prime;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		prime = new boolean[N+1];
		isPrime();
		int sum = 0; // 소수의 합계 저장할 변수
		int min = Integer.MAX_VALUE; // 소수 최솟값 저장할 변수
		for(int i = M; i <= N; i++){
			if(!prime[i]){
				sum += i; // 누적 합
				if(i < min){
					min = i; // 최솟값 갱신
				}
				
			}
		}
		if(sum == 0){ // 소수가 없는 경우
			System.out.println(-1);
		}
		else{
		System.out.println(sum);
		System.out.println(min);
		br.close();
		}
	}
	public static void isPrime(){ // 소수 판별 알고리즘
		prime[0] = prime[1] = true;

		for(int i = 2; i <= Math.sqrt(prime.length); i++){
			if(prime[i])
				continue;
			for(int j = i*i; j<prime.length; j += i){
				prime[j] = true;
			}
		}
	}
}