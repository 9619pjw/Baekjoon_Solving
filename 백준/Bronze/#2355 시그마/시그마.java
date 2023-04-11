import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());

		if(A>B){ // A>B일 경우 위치 변경함
			long tmp = A;
			A = B;
			B = tmp;
		}
		long sum = 0;
		
		if(A<0){ // A가 음수
			if(B<0){ // B가 음수일때
				A = -A;
				B = -B; // 부호 변경 후
				sum = A*(A+1) / 2 - B*(B+1)/2 + B; // 시그마 연산
				sum = -sum; // 부호 변경
			}
			else{ // B는 양수일때
				A = -A; // 부호 변경 후
				long tmp = A*(A+1) /2; // 0부터 A까지 시그마 연산
				tmp = -tmp; // 부호 변경
				sum = B*(B+1)/2; // 0부터 B까지 시그마 연산
				sum += tmp;
			}
		}
		else // 둘 다 양수인 경우
			sum = B*(B+1)/2 - A*(A+1)/2 + A;

		System.out.println(sum);
		br.close();
	}
}