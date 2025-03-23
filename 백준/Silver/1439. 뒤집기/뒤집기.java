import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        int cnt = 0; // 영역 개수 변수
        char c = s.charAt(0);

        // 영역 개수 카운팅
        for(int i = 1; i < s.length(); i++){
            if(c != s.charAt(i)){
                c = s.charAt(i);
                cnt++;
            }
        }

        // 영역 개수 / 2 + 영역 개수 % 2 == 최소 뒤집기 횟수 
        System.out.println((cnt / 2) + cnt % 2); 
        br.close();
    }
}