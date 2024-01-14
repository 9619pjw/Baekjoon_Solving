import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringBuilder sb = new StringBuilder();
            int M = Integer.parseInt(br.readLine());
            for(int j = 0; j < M; j++){
                sb.append("=");
                if(j == M-1)
                    sb.append("\n");
            }
            System.out.print(sb);
        }
        br.close();
    }
}