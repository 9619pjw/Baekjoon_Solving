import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()){ // 토큰을 다 살펴봄
			sb.append(st.nextToken().charAt(0)); // 토큰의 맨 앞글자만 추가
		}
		System.out.print(sb);
		br.close();
	}
}