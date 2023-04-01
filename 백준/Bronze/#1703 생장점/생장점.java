import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = 1; // 가지의 수는 초기엔 1

		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			if (age == 0)
				break; // 0이 입력되면 종료함

			for(int i = 0; i < age; i++){
				N *= Integer.parseInt(st.nextToken()); // 각 생장마다 자란 가지의 수
				N -= Integer.parseInt(st.nextToken()); // 잘라낸 가지
			}
			System.out.println(N);
			N = 1; // 초기화
		}

		br.close();
	}
}