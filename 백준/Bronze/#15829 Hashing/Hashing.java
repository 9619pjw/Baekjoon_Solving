import java.util.*;
import java.io.*;

class Main{
	static int M = 1234567891;
	static int r = 31;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine(); // 문자열을 입력받음
		long sum = 0;
		long pow = 1;

		for(int i = 0; i<N; i++){ // 문자 단위로 쪼개어 각 값들을 정수로 치환, 모두 더해서 하나의 해시값 생성
			sum += (s.charAt(i)-96)*pow;
			pow = (pow*r)%M; // M을 넘지 않게하기 위해 나머지 연산
		}
		System.out.println(sum%M);
		br.close();
	}
}
