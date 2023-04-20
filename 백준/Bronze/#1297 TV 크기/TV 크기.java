import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int D = Integer.parseInt(st.nextToken()); // 대각선
        int H = Integer.parseInt(st.nextToken()); // 높이 비율
        int W = Integer.parseInt(st.nextToken()); // 너비 비율

        double result = Math.sqrt((Math.pow(D,2)) / (Math.pow(H, 2) + Math.pow(W, 2)));
        System.out.print((int)Math.floor(result*H) + " " + (int)Math.floor(result*W)); // Math.floor() 로 주어진 숫자와 같거나 작은 정수 중 가장 큰 수 반환


        br.close();
    }
}