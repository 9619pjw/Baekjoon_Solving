import java.util.*;
import java.io.*;

class Main{
	static int answer = 0;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		// 최솟값 만들기 ... 가능한 큰 수를 빼야함. 더하기에 해당하는 부분 모두 연산 후 빼기 실행
		String[] str = s.split("-"); // - 기준으로 나눠줌

		for(int i = 0 ; i < str.length ; i++){
			int tmp = temp_sum(str[i]);

			if(i == 0)
				answer += tmp; // 가장 앞의 데이터는 더해주고
			else	
				answer -= tmp; // 나머지 데이터는 전부 뺄셈
		}
		System.out.println(answer);
		br.close();
	}
	public static int temp_sum(String a){ // + 기준으로 나눈 후 덧셈 연산.
		int sum = 0;
		String[] s = a.split("[+]");

		for(int i = 0; i < s.length ; i++){
			sum += Integer.parseInt(s[i]);
		}
		return sum;
	}
}