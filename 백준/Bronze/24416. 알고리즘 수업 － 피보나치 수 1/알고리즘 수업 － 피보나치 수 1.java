import java.util.*;
import java.io.*;

class Main {
    static int cntFib;
    static int cntFibonacci;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        cntFib = 0;
        cntFibonacci = 0;

        fib(N);
        fibonacci(N);

        bw.write(cntFib + " " + cntFibonacci);
        bw.flush();
        bw.close();
        br.close();
    }

    public static int fib(int x){
        if( x == 1 || x == 2 ){
            cntFib++;
            return 1;
        }
        else
            return fib(x-1) + fib(x-2);
    }

    public static int fibonacci(int x){
        int [] f = new int[x];
        f[0] = f[1] = 1;

        for(int i = 2; i < x; i++){
            cntFibonacci++;
            f[i] = f[i-1] + f[i-2];
        }

        return f[x-1];
    }
}