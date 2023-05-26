import java.util.*;
import java.io.*;

class Main{
    static int N = 64;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int ans = 0;

        while(X != 0){ // 2진수에서 1의 개수 구하는 방
            X &= (X-1);
            ans++;
        }
        System.out.println(ans);
        br.close();
    }
}