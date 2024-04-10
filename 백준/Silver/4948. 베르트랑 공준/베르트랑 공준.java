import java.util.*;
import java.io.*;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//무한루프
		while(true) {
			int n = Integer.parseInt(br.readLine());
			int count = 0;
			//소수 판별 배열
			boolean[] arr = new boolean[(2 * n) + 1];
			
			//0입력 시 무한루프 종료
			if(n == 0) break;
			
			//0과 1은 소수가 아니다.
			arr[0] = arr[1] = true;
			
			//에라토스테네스의 체 적용 반복문
			for(int i = 2; i * i <= 2 * n; i++) {
				if(!arr[i]) {
					for(int j = i * i; j <= 2 * n; j += i) {
						arr[j] = true;
					}
				}
			}
			
			//n초과 2n이하의 값들 중 소수라면 count에 +1
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!arr[i]) count++;
			}
			System.out.println(count);
		}
	}
}