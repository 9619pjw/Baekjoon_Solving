import java.util.*;
import java.io.*;

class Main{
	static int N;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 자릿수 입력
		// 소수는 2, 3, 5 ,7 이므로 해당 숫자부터 탐색을 시작
		DFS(2,1);
		DFS(3,1);
		DFS(5,1);
		DFS(7,1);
		br.close();
	}
	public static void DFS(int number, int size){
		if(size == N){ // 자릿수가 동일하고
			if(isPrime(number)){ // 소수면 출력
				System.out.println(number);
			}
			return;
		}
		for(int i = 1; i < 10; i++){
			if(i%2 == 0) // 짝수일 경우 더 이상 탐색할 필요가 없음
				continue;
			if(isPrime(number * 10 + i)){ // 소수인 경우
				DFS(number*10 + i, size+1); // 재귀를 이용해 자릿수를 늘림
			}
		}

	}
	static boolean isPrime(int num) { // 소수인지 판별
		for (int i = 2; i<= num/2 ; i++){
			if(num % i == 0)
				return false;
		}
		return true;		
	}
}