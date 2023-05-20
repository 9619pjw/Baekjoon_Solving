import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());

		long result = gcd(A,B);
		while(result > 0){ // 공약수의 길이만큼 1을 출력.
			bw.write("1"); 
			result--;
		}
		bw.flush();
		bw.close();
		br.close();
	}
	public static long gcd(long a, long b){ // 유클리드 호제법
		if(b == 0)
			return a;
		else	
			return gcd(b, a%b);
	}
}