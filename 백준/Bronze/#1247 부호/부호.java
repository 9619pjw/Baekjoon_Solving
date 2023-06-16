import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < 3; i++){
			int T = Integer.parseInt(br.readLine()); // 테스트 케이스 입력
			BigInteger sum = new BigInteger("0");
			for(int j = 0; j < T; j++){
				sum = sum.add(new BigInteger(br.readLine()));
			}
			int t = sum.compareTo(BigInteger.ZERO); // 0과 비교하여
			System.out.println(t == 0 ? "0" : t > 0? "+" : "-"); // 부호 출력
		}
	}
}
