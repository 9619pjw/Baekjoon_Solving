import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int i =0; i<7; i++){
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 1) { // 홀수일 경우, 더해줌
                sum+=n;
                min = Math.min(min, n); // 최솟값 업데이트
            }
        }
        if (sum == 0) { // 홀수가 존재하지 않으면 -1 츨력
            System.out.print(-1);
        } else {
            System.out.println(sum);
            System.out.print(min);
        }
    }
}