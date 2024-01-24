import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i = 1; i*i <= N; i++){
            cnt++;
        }
        bw.write(cnt +"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}