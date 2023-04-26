import java.util.*;
import java.io.*;
import java.math.*;

class Main{
    static int divide(int a, int b){
        int n;
        while(b != 0){
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
    static int max(int a, int b){
        return a*b / divide(a,b);
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(max(A,B));
        }
        br.close();
    }
}