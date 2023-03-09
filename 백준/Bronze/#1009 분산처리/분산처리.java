import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        int a, b, ans;
        for(int i =0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ans = 1;
            
            for(int j =0; j<b; j++){
                ans = (ans*a) %10; // 뒷자리만 남겨 곱해줌
            }
            if(ans == 0) // 뒷자리가 0일땐 10으로 변경
                ans = 10;
            System.out.println(ans);
        }
        br.close();
    }
}