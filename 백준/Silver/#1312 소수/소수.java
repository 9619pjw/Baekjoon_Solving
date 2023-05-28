import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 분자
        int B = Integer.parseInt(st.nextToken()); // 분모
        int N = Integer.parseInt(st.nextToken()); // 소숫점 아래 자리수

        int num = A % B; // 나머지
        int tmp;

        for(int i = 1; i <= N; i++){
            tmp = (num*10) / B;
            num = (num*10) % B;
            if(i == N){
                bw.write(Integer.toString(tmp));
                bw.close();
            }
        }
        br.close();
    }    
}