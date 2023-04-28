import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()); // 분자
        int y = Integer.parseInt(st.nextToken()); // 분모

        st = new StringTokenizer(br.readLine());
        int z = Integer.parseInt(st.nextToken()); // 분자
        int w = Integer.parseInt(st.nextToken()); // 분모
        
        int r1 = x*w + z*y; // 결과 분자
        int r2 = y * w; // 결과 분모

        int mod = gcd(r1, r2); // 최대 공약수로 분자와 분모 나눠줌
        r1 /= mod;
        r2 /= mod;

        bw.write(r1 + " " + r2 + "\n");
        bw.flush();
        bw.close();
        br.close();
        
    }
    // 유클리드 호제법
    public static int gcd(int a, int b) {
       // a가 b보다 큰 경우에 대해서 수행.
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b , a % b);
    }
}