import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); // 고정비용
		int B = Integer.parseInt(st.nextToken()); // 가변비용
		int C = Integer.parseInt(st.nextToken()); // 가격

		if(B >= C){ // 가변비용 >= 가격 ... 이득이 발생할 수 없음
			System.out.println(-1);
		}else{
			int result = A / (C-B); // 손익 분기점 계산
			System.out.println(result + 1); // 이득이 시작되는 부분을 찾기위해 +1
		}

		br.close();
	}
}