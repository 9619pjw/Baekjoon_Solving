import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] s = new String[N];
        int cnt = 0;

        for(int i = 0; i < N; i++){
            
            s[i] = br.readLine();
            s[i] = s[i].substring(2);
            
            int tmp = Integer.parseInt(s[i]);

            if(tmp <= 90){
                cnt++;
            }
        
        }
        bw.write(cnt + "");
        bw.flush();
        bw.close();
        br.close();
    }
}