import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;

        for (int i = 0; i < M; i++) {
            n1 = n1.multiply(new BigInteger(String.valueOf(N - i))); // N! 연산
            n2 = n2.multiply(new BigInteger(String.valueOf(i + 1))); // M! * (N-M)! 연산
        }

        BigInteger answer = n1.divide(n2);

        System.out.println(answer);
		br.close();
    }
}