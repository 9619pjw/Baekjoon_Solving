import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while(cnt != N){// cnt == N일때 반복문 종료
            num++;
            if(String.valueOf(num).contains("666")){ // num이 666을 포함할 경우, cnt 증가
                cnt++;
            }
        }
        System.out.println(num);
        br.close();
    }
}