import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long result = 0;

        for(long i = 1; i <= N-1; i++){
            result += (N * i) + i;
        }
    
        System.out.println(result);
        br.close();
    }
}