import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()); // 원래 고기의 온도
        int B = Integer.parseInt(br.readLine()); // 목표 온도
        int C = Integer.parseInt(br.readLine()); // 얼어있는 고기를 1만큼 데우는데 걸리는 시간
        int D = Integer.parseInt(br.readLine()); // 얼어있는 고기를 해동하는 시간
        int E = Integer.parseInt(br.readLine()); // 얼지않은 고기를 1만큼 데우는데 걸리는 시간

        int result = 0;

        if(A < 0){
            result = (Math.abs(A) * C) + D + (B * E);
        }else if(A == 0){
            result = D + (B * E);
        }else{
            result = (B - A) * E;
        }

        System.out.println(result);
        br.close();
    }
}