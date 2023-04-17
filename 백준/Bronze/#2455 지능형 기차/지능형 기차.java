import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0; // 최대 인원
        int sum = 0; // 현재 탑승 인원
        for(int i =0; i<4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int tmp = b-a; // 한 정거장에서 탑승 인원 - 하차 인원
            sum += tmp;
            if(max < sum) // 최대 인원 업데이트
                max = sum;
        }
        System.out.println(max);
        br.close();
    }
}