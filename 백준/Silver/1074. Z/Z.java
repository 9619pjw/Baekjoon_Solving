import java.util.*;
import java.io.*;

class Main{
    static int x = 0;
    static int y = 0;
    static int cnt = 0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
    
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
    
        int result = Z((int)Math.pow(2,N), r, c);
        System.out.println(result);
        br.close();
    }

    public static int Z(int n, int r, int c){
        //리턴될때마다 칸을 줄임.
		n /= 2;
		//좌표가 왼쪽 위에 위치
		if(r < x + n && c < y + n) {
			cnt += (n * n * 0);
		//오른쪽 위에 위치
		}else if(r < x + n && c >= y + n) {
			cnt += (n * n * 1);
			y += n;
		//왼쪽 아래에 위치
		}else if(c < y + n) {
			cnt += (n * n * 2);
			x += n;
		//오른쪽 아래에 위치
		}else {
			cnt += (n * n * 3);
			x += n;
			y += n;
		}
        // n == 1이되면 재귀 종료
		if(n == 1) return cnt;
		return Z(n, r, c);
    }
}