import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main{ 
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 원판 이동 횟수 == 2^n -1
        BigInteger c = new BigInteger("2");
        BigInteger cnt= c.pow(N).subtract(BigInteger.ONE);
        System.out.println(cnt);
        
        // N이 20 이하인 경우에만 이동 경로를 출력
        if (N <= 20) {
            move(N, 1, 3);
            System.out.print(sb);
        }
        br.close();
    }

    // 기둥 번호의 합이 6이므로 중간 기둥 == 6-x-y
    static void move(int n, int x, int y){
        if(n > 1){ 
            move(n-1, x, 6-x-y);
        }
        sb.append(x + " " + y + "\n");
        if(n > 1) {
            move(n-1, 6-x-y, y);
        }
    }
}