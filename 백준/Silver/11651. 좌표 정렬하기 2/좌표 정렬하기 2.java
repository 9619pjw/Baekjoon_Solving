import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2];
        for(int i =0; i<N; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int tx = Integer.parseInt(st.nextToken());
            int ty = Integer.parseInt(st.nextToken());

            arr[i][0] = tx;
            arr[i][1] = ty;
        }

        Arrays.sort(arr, (a, b) ->{
            if(a[1] == b[1]) // y좌표 동일 시, x좌표 기준으로 정렬
                return a[0] - b[0];
            return a[1] - b[1]; // y좌표 기준으로 정렬
        });

        for(int i =0; i<N; i++){
            int x = arr[i][0];
            int y = arr[i][1];
            bw.write(x + " " + y + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}