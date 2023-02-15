import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

       bw.write(gcd(a,b) + "\n");        // gcd(a,b) == gcd(b,a%b)
       bw.write(a * b / gcd(a,b) + "");

        bw.flush();
        bw.close();
    }
}
