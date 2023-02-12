import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int H = Integer.parseInt(st.nextToken()); // 층 수
            int W = Integer.parseInt(st.nextToken()); // 방 수
            int N = Integer.parseInt(st.nextToken()); // 손님 번호
            
            if(N%H != 0) // 손님이 꼭대기층이 아닌 경우
                System.out.printf("%d%02d\n", N%H, N/H+1); // N%H층의 N/H+1호에 숙박
            else    // 손님이 꼭대기 층에 묵는 경우
                System.out.printf("%d%02d\n", H,N/H); // H층의 N/H호에 숙박
        }
        br.close();
    }
}